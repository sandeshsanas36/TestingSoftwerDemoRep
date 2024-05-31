package basicActionOnClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpDown 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		Actions a = new Actions(driver);
		
		WebElement beauty = driver.findElement(By.xpath("//span[text()='BEAUTY']"));
		
		//a.click(beauty);
		
		a.keyDown(Keys.CONTROL);	//to press control button
		
		a.click(beauty);
		
		a.keyUp(Keys.CONTROL);		//to release control button
		
		a.perform();
	}

}
