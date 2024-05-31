package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/hp/Downloads/demo-1.html");
		
		WebElement Multiple_DropDown = driver.findElement(By.id("multiple_cars"));
		
		Select sel = new Select(Multiple_DropDown);
		
		boolean Result = sel.isMultiple();
		
		System.out.println(Result);

	}

}
