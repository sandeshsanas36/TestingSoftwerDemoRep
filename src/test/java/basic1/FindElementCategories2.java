package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementCategories2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		java.util.List<WebElement> Links = driver.findElements(By.xpath("(//div[@class='listbox'])[1]/ul/li/a"));
		
		for(WebElement web : Links)
		{
			web.click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(2000);
		}
	}

}
