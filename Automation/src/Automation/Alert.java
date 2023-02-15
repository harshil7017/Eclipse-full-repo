package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePackage.Base;

public class Alert extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setup();
		WebElement alert = driver.findElement(By.id("alertbtn"));
		alert.click();
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.id("confirmbtn"));
		confirm.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}
