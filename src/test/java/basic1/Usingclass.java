package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingclass 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		WebElement Register = driver.findElement(By.className("ico-register"));
//		
//		Register.click();
		
		WebElement login = driver.findElement(By.className("ico-login"));
		
		login.click();
	}

}
