package Automation;

import org.openqa.selenium.By;

import BasePackage.Base;

public class TraverseLocators extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Setup();
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
	}

}
