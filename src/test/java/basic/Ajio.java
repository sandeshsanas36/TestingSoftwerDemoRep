package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.ajio.com/");
//		driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("Watches");
//		driver.findElement(By.cssSelector("span[class='ic-search']")).click();
//		//driver.findElement(By.cssSelector("label[class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
//		
//		
//		//using Xpath
//		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//input[@placeholder,'Enter skills')]")).click();
		
	}
}

