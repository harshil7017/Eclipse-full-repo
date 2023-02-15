package Automation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropdownCheckboxSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="Option1";
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Ckoption=driver.findElement(By.xpath("//input[@value='option1']"));
		Ckoption.click();
			
	
		
		List<WebElement> selection=driver.findElements(By.cssSelector("select[id='dropdown-class-example']"));
		
		for (WebElement element : selection)
		{
			 if (element.getText().contains(name))
			 {
				   element.click();
				   break;
				   
			 }
			 
		         
		}
		
		//String name="Option1";
		
		//WebElement Seoption=driver.findElement(By.xpath("//option[@value='option1']"));
//		List<WebElement> selection=driver.findElements(By.cssSelector("select[id='dropdown-class-example']"));
//		for (WebElement element : selection)
//		{
//			 if (element.getText().contains("Option1"))
//			 {
//				   element.click();
//			 }
//		         
//		}
//		Select se = new Select(driver.findElement(By.cssSelector("select[id='dropdown-class-example']")));
//		if(Ckoption.isSelected()!=false)
//		{
//			Seoption.click();
//		}
//		
		// Select the option by index
//		se.selectByIndex(3);
//		for(int i=0;i<selection.size();i++)
//		{
//			String name=selection.get(i).getText();
//			
//			
//		
//		
//	}
//	

}
}

