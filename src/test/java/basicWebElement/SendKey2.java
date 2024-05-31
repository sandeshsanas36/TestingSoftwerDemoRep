package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tirabeauty.com/");
		
		Thread.sleep(2000);
		
		WebElement searchtf = driver.findElement(By.id("search"));
		
		Thread.sleep(2000);
		
		searchtf.sendKeys("perfumes");
		
		Thread.sleep(2000);
		
		searchtf.sendKeys(Keys.ENTER);
	}

}
