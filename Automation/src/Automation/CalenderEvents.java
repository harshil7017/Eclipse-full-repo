package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date]']")).click();
		List<WebElement> dates=driver.findElements(By.className("elementor-field elementor-size-sm elementor-field-textual elementor-date-field flatpickr-input active"));
		int count=driver.findElements(By.className("elementor-field elementor-size-sm elementor-field-textual elementor-date-field flatpickr-input active")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("elementor-field elementor-size-sm elementor-field-textual elementor-date-field flatpickr-input active")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("elementor-field elementor-size-sm elementor-field-textual elementor-date-field flatpickr-input active")).get(i).click();
			}
		}
	}

}
