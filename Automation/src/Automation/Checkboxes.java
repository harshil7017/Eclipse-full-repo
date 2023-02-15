package Automation;

import org.openqa.selenium.By;

import BasePackage.Base;

public class Checkboxes extends Base {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Setup();
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
	}

}
