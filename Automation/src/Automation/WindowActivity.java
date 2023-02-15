package Automation;

import BasePackage.Base;

public class WindowActivity extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setup();
		driver.navigate().to("https://www.udemy.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
