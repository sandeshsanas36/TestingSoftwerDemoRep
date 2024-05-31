package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
		driver.get("https://demowebshop.tricentis.com/");
				
		Thread.sleep(2000);
		
		String givenDATA="https://demowebshop.tricentis.com/";
				
		String currentURL = driver.getCurrentUrl();
				
		//register
		if(givenDATA.equals(currentURL)) 
		{
			System.out.println("i am in demo web shop dws page");
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		
		}
		else
		{
			System.out.println("check the page");
		
		}

		Thread.sleep(2000);
				
		//login
		if(givenDATA.equals(currentURL)) 
		{
			System.out.println("i am in demo web shop dws page");
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
					
		}
		else
		{
			System.out.println("check the page");
		
		}

		Thread.sleep(2000);
				
		//shopping cart
		if(givenDATA.equals(currentURL)) 
		{
			System.out.println("i am in demo web shop dws page");
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
					
		}
		else
		{
			System.out.println("check the page");
		
		}
		
		Thread.sleep(2000);
				
		//wishlist
		if(givenDATA.equals(currentURL)) 
		{
			System.out.println("i am in demo web shop dws page");
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();
					
		}
		else
		{
			System.out.println("check the page");
				
		}
	}
		
}
