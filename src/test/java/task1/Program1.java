package task1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/hp/Downloads/MultipleWindow.html");
		
		String GivenUrl = "file:///C:/Users/hp/Downloads/MultipleWindow.html";
		
		if(GivenUrl.equals(GivenUrl))
		{
			System.out.println("Currect page");
			
			driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
			
			Thread.sleep(4000);
			
			Set<String> id = driver.getWindowHandles();
			
			//System.out.println(id);
			
			int i =0;
			
			for(String win : id)
			{	
				
				driver.switchTo().window(win).getCurrentUrl();
		
				
				if(i>=1)
				{
					System.out.println("ok");
					
					driver.manage().window().maximize();
					
					Thread.sleep(2000);
				}	
				
				i++;
					
			}
		}
		else
		{
			System.out.println("Wrong Page");
		}
		
		Thread.sleep(3000);
		
		
		Set<String> w = driver.getWindowHandles();
		
		int j =0;
		
		for(String web : w)
		{
			driver.switchTo().window(web);
			if(j>0)
			{
				driver.close();
			}
			j++;
		}
		

	}

}
