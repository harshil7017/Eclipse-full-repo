package Automation;



	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestJAVA {


		public  WebDriver driver;
		public  JavascriptExecutor je;
		
		
		@BeforeTest
		public void setup()
		{
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");  // Username & password are mentioned in website.
		
		}
		
		@AfterTest
		public void teardown()
		{
			driver.quit();
		}
		
		@Test    //Verifying Product listing price  from Low to High 
		public void VerifyAddtoProduct() throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			
			List <WebElement> pricelist = driver.findElements(By.className("inventory_item_price"));
			
			Double max_value_price = pricelist
					.stream()
					.mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$","")))
					.max()
					.getAsDouble();
			
			System.out.println(max_value_price);
			
			String xpath_addtocart = "//div[normalize-space()= '$"+max_value_price+"']/following-sibling::button[text()='Add to cart']";
			driver.findElement(By.xpath(xpath_addtocart)).click();
			
			Thread.sleep(3000);
			
		
		}
	}

