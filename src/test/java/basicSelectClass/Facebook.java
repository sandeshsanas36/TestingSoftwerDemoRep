package basicSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s = new Select(month);
		
//		s.selectByVisibleText("May");
//		s.selectByValue("4");
//		s.selectByIndex(2);
		
		System.out.println(s.isMultiple());
	}

}
