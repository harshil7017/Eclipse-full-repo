package Automation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPractise {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		//Enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		//Enter password
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		//Select radio button
	//	
		driver.findElement(By.xpath("//input[@value='user']")).click();
		//Accept alerts
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		//Select dropdown
		driver.findElement(By.xpath("//select[@class='form-control']/child::option[3]")).click();
		//select consent box
		driver.findElement(By.xpath("//input[@name='terms']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='terms']")).getText());
		//wait until the signin button
		driver.findElement(By.xpath("//input[@class='btn btn-info btn-md']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@class='btn btn-info btn-md']")));		
		//Find out the elements to be listed
		String[] itemNeeded= {"iphone X","Samsung Note 8"};
		List<WebElement> products=driver.findElements(By.cssSelector("h4.card-title"));
	
		
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			System.out.println(name);
			List<String> itemlist=Arrays.asList(itemNeeded);
			Thread.sleep(5000);
			if(itemlist.contains(name))
			{
				
//				WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(10));
//				waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']")));
//				WebElement WebElement = driver.findElement(By.xpath("//button[@class='card-footer']"));
//				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", WebElement);
		        driver.findElements(By.xpath("//button[contains(.,'Add')]")).get(i).click();
			}
		}
	
	}
	
}
