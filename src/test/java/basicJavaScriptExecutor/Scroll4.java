package basicJavaScriptExecutor;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll4 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.name("searchVal")).sendKeys("Watches");
		
		driver.findElement(By.className("ic-search")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		for (; ; ) {
		
		try {
			driver.findElement(By.cssSelector("img[alt='Product image of French Connection FCM0001B Analogue Wrist Watch with Leather Strap']")).click();
			break;
			} catch (NoSuchElementException e)
				{
			
			jse.executeScript("window.ScrollBy(0,900)");
		
				}
					}

	}
}