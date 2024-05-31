package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode1
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/test");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("fullName")).sendKeys("SANDESH SANAS");
	}
}
