package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String GivenData = "https://demowebshop.tricentis.com/";
		
		String CurrentUrl = driver.getCurrentUrl();
		
		if (GivenData.equals(CurrentUrl)) 
		{
			System.out.println("You Are In Right Page");
			
			driver.findElement(By.cssSelector("a[class='ico-register']")).click();
			
			String GivenTitle = "Demo Web Shop. Register";
			
			String CurrentTitle = driver.getTitle();
			
			if (GivenTitle.equals(CurrentTitle)) 
			{
				System.out.println("Title Is Correct");
				
				driver.findElement(By.id("gender-male")).click();
				
				driver.findElement(By.id("FirstName")).sendKeys("Sandesh");
				
				driver.findElement(By.id("LastName")).sendKeys("Sanas");
				
				driver.findElement(By.id("Email")).sendKeys("sandesh123@gmail.com");
				
				driver.findElement(By.id("Password")).sendKeys("sandesh@123");
				
				driver.findElement(By.id("ConfirmPassword")).sendKeys("sandesh@123");
				
				driver.findElement(By.id("register-button")).click();
				
				driver.navigate().back();
				
				Thread.sleep(2000);
				
				driver.navigate().back();
				
				Thread.sleep(4000);
				
				driver.close();
				
			} 
			else 
			{
				System.out.println("Title Is Wrong");
			}
		}
		else
		{
			System.out.println("You Are In Wrong Page");
		}
	
	}

}
