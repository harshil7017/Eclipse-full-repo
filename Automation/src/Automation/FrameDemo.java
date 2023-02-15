package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		
		
	}
	

}
