package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.myntra.com/");
//		
//		// open search bar and type watches
//		driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("Watches");
//		
//		//click on search icon to search watches 
//		driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("gotten pass")).click();
	}
}
