package basicPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		//driver.findElement(By.id("login_Layer")).click();
		
		//driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("Sandesh@gmail.com");
		
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		
		//String expectedurl = "https://www.naukri.com/pune";
		
	   /*if (actualurl.equals(expectedurl))
		{
			System.out.println("URL Is Matching");
		}
		else
		{
			System.out.println("URL Is Not Matching");
		}*/
		
		//Create Obj of WebDriverWait class and pass webdriver ref, time delay as an arug to WebDriverWait constructor
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
		
		//step 2 call until()
		//step 3 pass predicate function (condition method) as an arug to util()
		
		w.until(ExpectedConditions.urlToBe("https://www.naukri.com/pune"));
		
		
		System.out.println("Good Morning!!!!!!!!!!!!!");
	}

}
