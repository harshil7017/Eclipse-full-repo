package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.Iterator;
import java.util.Set;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
//		driver.switchTo().newWindow(WindowType.TAB);
//		Set<String> handles=driver.getWindowHandles();
//		Iterator<String> it=handles.iterator();
//		String parentWindowId=it.next();
//		driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(5000);
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		System.out.println(nameEditBox.getRect().getDimension().getHeight());
		System.out.println(nameEditBox.getRect().getDimension().getWidth());
		
	}

}
