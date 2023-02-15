package Automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNg {
	@Parameters({"URL"})
	@Test(groups={"smoke"})
	public void demo()
	{
		System.out.println("hello");
	}
	@Test(dependsOnMethods = {"demo"})
	public void demo1()
	{
		System.out.println("hello gm");
	}
	@BeforeTest(timeOut = 40000)
	public void demo2()
	{
		System.out.println("good");
	}
	@BeforeSuite(enabled = false)
	public void demo3()
	{
		System.out.println("Very good");
	}
	@AfterSuite
	public void demo4()
	{
		System.out.println("very very good");
	}
	@BeforeMethod
	public void dem5()
	{
		System.out.println("g g");
	}
	@AfterMethod
	public void demo6()
	{
		System.out.println("abc");
	}
	@BeforeClass
	public void demo7()
	{
		System.out.println("abcd");
	}
}
