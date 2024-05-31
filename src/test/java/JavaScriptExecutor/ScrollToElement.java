package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.dream11.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement Rating = driver.findElement(By.xpath("//span[text()='Rating']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", Rating);
	}
}
