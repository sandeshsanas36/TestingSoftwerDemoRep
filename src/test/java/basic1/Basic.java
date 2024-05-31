package basic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		String Given_Data = "https://demowebshop.tricentis.com/";
//		
//		String CurrentData = driver.getCurrentUrl();
//		if(Given_Data.equals(CurrentData))
//		{
//			System.out.println("You are in DownWebShop");
//			
//			Thread.sleep(2000);
//		
//			driver.navigate().back();
//		
//			Thread.sleep(2000);
//		
//			driver.navigate().forward();
//		
//			Thread.sleep(2000);
//		
//			driver.navigate().refresh();
//		
//			Thread.sleep(2000);
//		
//			driver.close();
//		}
//		else
//		{
//			System.out.println("You are Not in DownWebShop");
//		}
		
		String GivenTitle = "Demo Web Shop";
		
		String CurrentTitle = driver.getTitle();
		
		if (GivenTitle.equals(CurrentTitle)) 
		{
			System.out.println("You are in Same Title");
		} 
		else 
		{
			System.out.println("You are Not in Same Title");
		}
	}

}






