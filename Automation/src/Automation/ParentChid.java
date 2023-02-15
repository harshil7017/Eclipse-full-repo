package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div/a")).click();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9839383938");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
		System.out.println(driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText());
		driver.findElement(By.xpath("//div/button[@class=\"go-to-login-btn\"]")).click();
		driver.findElement(By.xpath("input[type *= \"pass'\"]")).sendKeys("292829");
		
	}

}
