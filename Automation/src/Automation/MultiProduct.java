package Automation;



import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemNeeded= {"Cauliflower","Pista"};		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			List<String> itemlist=Arrays.asList(itemNeeded);
			//System.out.println(formattedName);
	
			if(itemlist.contains(formattedName))
			{
			
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
			}
			
		}
		WebElement cartlist=driver.findElement(By.xpath("//a[@class='cart-icon']"));
		cartlist.click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div[@class='action-block']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		
		
	}

}
