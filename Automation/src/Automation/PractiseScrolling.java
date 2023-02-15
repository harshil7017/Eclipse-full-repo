package Automation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PractiseScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		ChromeOptions option1=new ChromeOptions();
		option1.setAcceptInsecureCerts(false);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.table-display').scrollTop=5000");
		//List<WebElement> values=driver.findElements(By.cssSelector(".table-display td:nth-child(2)"));
		
		System.out.println(driver.findElements(By.tagName("tr")).size());
		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());
		List<WebElement> SecondData=driver.findElements(By.cssSelector(".table-display tr"));
		for(int i=0;i<SecondData.size();i++)
		{
			
			
		}
		
		
		
	}
	

}
