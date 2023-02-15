package BasePackage;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
		
		public static WebDriver driver;  // 
		
		// function
		public static WebDriver Setup()
		{
				driver=new ChromeDriver();  //open chromedriver
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //open URL
				driver.manage().window().maximize();
				return driver;
		}
		
		//locate the elements
		public static void getLocators() throws InterruptedException
		{
			driver.findElement(By.cssSelector("input[placeholder='Username']")).click();	
			driver.findElement(By.id("inputUsername")).sendKeys("harshilsheth@outlook.com");
			driver.findElement(By.name("inputPassword")).sendKeys("aba");
			driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			//driver.findElement(By.linkText("Forgot your password?")).click();
			//parse string
			driver.findElement(By.xpath("input[type*=\"pass\"]")).sendKeys("abc");
		}	
	}