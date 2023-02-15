package Automation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BasePackage.Base;
import junit.framework.Assert;

public class BookTicket extends Base{

	public static void main(String[] args) throws InterruptedException, ParseException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();  //open chromedriver
		driver.get("https://www.spicejet.com/");  //open URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
	
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).sendKeys("Ah");
		driver.findElement(By.xpath("//div[contains(text(),'Sardar Vallabhbhai Patel International Airport')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Sri Guru Ram Dass Jee International Airport')]")).click();
		
		DateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy");
		
		Date today = Calendar.getInstance().getTime();
		String date = dateFormat.format(today);
		
		WebElement e=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"));
		if(e.isDisplayed()==true)
		{
			e.click();
			
		}
		else
		{
			System.out.println("No data selected");
		}
	
	
	}
	

}
