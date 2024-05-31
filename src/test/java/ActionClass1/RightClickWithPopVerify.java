package ActionClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickWithPopVerify 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(RightClick).build().perform();
		
		act.contextClick().build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
		try 
		{
			RightClick.click();
			
			System.out.println("Pop Is Not Displayed");
			
		}
		catch (Exception e) 
		{
			System.out.println("Pop Is Displayed");
		}
		
		System.out.println("My Script is SuccessFul!!!!!");

	}

}
