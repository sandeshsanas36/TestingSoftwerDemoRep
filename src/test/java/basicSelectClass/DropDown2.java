package basicSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.letcode.in/test");
		
		driver.findElement(By.linkText("Drop-Down")).click();
		
		WebElement mul = driver.findElement(By.id("superheros"));
		
		Select s = new Select(mul);
		
		System.out.println(s.isMultiple());

	}

}
