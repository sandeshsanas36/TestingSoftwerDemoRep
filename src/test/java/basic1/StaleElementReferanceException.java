package basic1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleElementReferanceException 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		
		WebElement TargetElement = driver.findElement(By.id("products-orderby"));
		
		Select Sel = new Select(TargetElement);
		
		List<WebElement> options = Sel.getOptions();
		
		int i = 0;
		
		for(WebElement web : options)
		{
			TargetElement = driver.findElement(By.id("products-orderby"));
			
			Sel = new Select(TargetElement);
			
			Sel.selectByIndex(i++);
			
			Thread.sleep(1000);
		}

	}

}
