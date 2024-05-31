package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("wallets");
		
		driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
		
		
			
	}

}
