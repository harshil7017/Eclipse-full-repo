package Extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {

	@BeforeTest
	public void extentreports()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	}
	@Test
	public void initiateDemo()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		
	}

}
