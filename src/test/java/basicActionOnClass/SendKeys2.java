package basicActionOnClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys2
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		Actions a = new Actions(driver);
		
		a.sendKeys(Keys.PAGE_DOWN);

		Thread.sleep(4000);
		
		a.sendKeys(Keys.PAGE_UP);
		
		a.perform();
	}

}
