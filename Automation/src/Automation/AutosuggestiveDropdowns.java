package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePackage.Base;

public class AutosuggestiveDropdowns extends Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Setup();
		WebElement autosuggest=driver.findElement(By.xpath("//div[@class='maincontainer'] //input[@id='autosuggest']"));
		autosuggest.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
		autosuggest.sendKeys("ind");
		Thread.sleep(4000);
		List<WebElement> options =driver.findElements(By.xpath("(//a[normalize-space()='India'])[1]"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
	}

}
