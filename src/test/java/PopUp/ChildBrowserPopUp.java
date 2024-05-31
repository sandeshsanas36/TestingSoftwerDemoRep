package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowserPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String GivenDWS = "https://demowebshop.tricentis.com/";
		
		String GivenFacebook ="https://www.facebook.com/";
		
		String GivenTw = "https://twitter.com/?lang=en";
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		
		Thread.sleep(2000);
		
		Set<String> ChildHandle = driver.getWindowHandles();
		
		Thread.sleep(2000);
		
		for(String str : ChildHandle)
		{
			driver.switchTo().window(str);
			
			String CurrentData = driver.getCurrentUrl();
			
			if(GivenDWS.equals(CurrentData))
			{
				driver.findElement(By.id("small-searchterms")).sendKeys("Sandesh");
			}
			else if(GivenFacebook.equals(CurrentData))
			{
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("SandeshSanas123");
				
				driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Sandesh123");
				
			}
			else
			{
				driver.findElement(By.partialLinkText("Create account")).click();
			}
		}
		Thread.sleep(2000);
		
		

	}

}


