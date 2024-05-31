package task1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/hp/Downloads/MultipleWindow.html");
		
		String GivenUrl = "file:///C:/Users/hp/Downloads/MultipleWindow.html";
		
		if(GivenUrl.equals(GivenUrl))
		{
			System.out.println("Right Url");
			
			driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
			
			Thread.sleep(4000);
			
			Set<String> id = driver.getWindowHandles();
			
			int i = 0;
			
			for(String win : id)
			{
				
				
				
				if(i>0)
				{
					
					driver.switchTo().window(win);
					
					driver.manage().window().maximize();
					
					String Title = driver.getTitle();
					
					System.out.println("Child Page Title "+":-" +Title);
					
				}
				
				i++; 
			}
			
		}
		else
		{
			System.out.println("Wrong Url");
		}
		
		Thread.sleep(3000);
		
		Set<String> w = driver.getWindowHandles();
		
		int j =0;
		
		for(String web : w)
		{
			driver.switchTo().window(web);
			if(j<1)
			{
				driver.close();
			}
			j++;
		}

	}

}
