package task1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program3 {

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
				if(i<0)
				{
				String RestUrl = "https://www.olivegarden.com/home";
				
				String Curl = driver.getCurrentUrl();
				
				if(Curl.equals(RestUrl))
				{
					
					driver.switchTo().window(win);
					
					driver.manage().window().maximize();
					
					driver.switchTo().alert().accept();
					
					driver.findElement(By.xpath("//a[@class='trackContent d-none d-md-inline-block btn btn-mainstyle thick text-white rounded mt-2 px-5 text-uppercase']")).click();
					
				}
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
