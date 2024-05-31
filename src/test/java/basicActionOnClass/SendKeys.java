package basicActionOnClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		Actions a = new Actions(driver);
		
		WebElement searchtf = driver.findElement(By.name("searchVal"));
		
		a.sendKeys(searchtf, "Jackets");
		
		a.perform();
	}

}
