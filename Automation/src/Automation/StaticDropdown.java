package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePackage.Base;

public class StaticDropdown extends Base{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Setup();
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(3);
		//dropdown.selectByVisibleText("INR");
		dropdown.selectByValue("USD");
		
		driver.findElement(By.xpath("//div/child::div[@class='row1 adult-infant-child']")).click();
		Thread.sleep(2000);
		for(int i=0;i<6;i++)
		{	
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			i++;
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		WebElement fromcity=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		fromcity.click();
		fromcity.sendKeys("Goa (GOI)");
		Thread.sleep(5000);
		WebElement ToCity=driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		ToCity.click();
		ToCity.sendKeys("Adampur (AIP)");
		
	
		
	}

}
