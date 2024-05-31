package basic1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SteelElementReferanceException 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		
		WebElement sort_by = driver.findElement(By.id("products-orderby"));
		
		Select s = new Select(sort_by);
		
		List<WebElement> options = s.getOptions();
		
		int i = 0;
		
		for(WebElement web : options)
		{
			sort_by = driver.findElement(By.id("products-orderby"));
			
			s = new Select(sort_by);
			
			s.selectByIndex(i++);
		}
	}

}