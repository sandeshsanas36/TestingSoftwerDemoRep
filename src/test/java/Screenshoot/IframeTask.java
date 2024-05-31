package Screenshoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTask 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("file:///C:/Users/hp/Downloads/iframe-1.html");
		
		driver.switchTo().frame("FR1");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Selenium007");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.linkText("Google")).click();

	}

}
