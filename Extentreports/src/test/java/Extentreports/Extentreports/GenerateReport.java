package Extentreports.Extentreports;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
public class GenerateReport
{

	
	ExtentReports extent;
	@BeforeTest
	
	public void config()
	{
		String stor=System.getProperty("user.dir")+ ("//Reports//index.html");
		ExtentSparkReporter reporter=new ExtentSparkReporter(stor);
		reporter.config().setReportName("webautomationresults");
		reporter.config().setDocumentTitle("Test results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "extent reports");
		
	
	}
	@Test
	public void initialDemo()
	{
		//ExtentTest test=extent.createTest("initialdemo");
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println(driver.getTitle());
	//	driver.close();
		//test.fail("result not match");
		//extent.flush();
		
	}
	
}
