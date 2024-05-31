package basic1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleLevelDropDownMenu
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///C:/Users/hp/Downloads/demo-1.html");
		
		WebElement Multiple_DropDown = driver.findElement(By.id("multiple_cars"));
		
		Select sel = new Select(Multiple_DropDown);
		
		int i = 0;
		
		List<WebElement> options = sel.getOptions();
		
		for(WebElement web : options)
		{
			sel.selectByIndex(i++);
			
			Thread.sleep(1000);
		}
		
		i = 0;
		
		for(WebElement web : options);
		{
			sel.deselectByIndex(i++);
			
			Thread.sleep(1000);
		}
		
//		sel.deselectAll();

	}

}
