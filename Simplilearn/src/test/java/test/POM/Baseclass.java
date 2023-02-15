package test.POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public WebDriver driver;
	
	public WebDriver initializeBrowser() throws IOException
	{
		Properties pro=new Properties();
		FileInputStream FIS=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//test//resources//GlobalData.properties");
		pro.load(FIS);
		String browsername=pro.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get("https://www.makemytrip.com/");
		}
		return driver;
	}
	
	public void launchApplication() throws IOException
	{
		 driver=initializeBrowser();
	}
}
