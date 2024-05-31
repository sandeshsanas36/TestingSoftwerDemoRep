package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeSignup
{
	public static void main(String[] args)
	{
		//sign up on letcode.in/test
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/test");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("name")).sendKeys("Sandesh Sanas");
		driver.findElement(By.id("email")).sendKeys("sanassandesh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sandesh36");
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.cssSelector("button[class='button is-primary']")).click();
	}
}
