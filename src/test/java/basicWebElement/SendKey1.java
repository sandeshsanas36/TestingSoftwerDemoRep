package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sandeshSanas@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
	}

}
