package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		java.util.List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		
		for(WebElement web : links)
		{
			web.click();
			
			driver.navigate().back();
			
			Thread.sleep(1000);
		}

	}

}
