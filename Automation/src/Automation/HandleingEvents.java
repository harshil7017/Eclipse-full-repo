package Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleingEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				WebDriver driver=new EdgeDriver();
				driver.get("https://www.makemytrip.com/");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
				Thread.sleep(5000);
				/*driver.findElement(By.xpath("//label[@for='fromCity']")).click();
				driver.findElement(By.xpath("//label[@for='fromCity']")).submit();*/
	}
	
}



