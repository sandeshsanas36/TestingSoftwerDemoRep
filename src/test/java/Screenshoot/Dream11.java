package Screenshoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://www.dream11.com/");
		
		//driver.switchTo().frame(0);			//using int
		
		//driver.switchTo().frame("send-sms-iframe");		//using string
		
		WebElement  ele = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		
		driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9403354842");
		
		driver.switchTo().parentFrame();  
		
		driver.findElement(By.id("hamburger")).click();

	}

}
