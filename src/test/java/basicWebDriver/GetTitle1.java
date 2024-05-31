package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle1 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		// to max the window
		driver.manage().window().maximize();
		
		//launch application
		driver.get("https://www.ajio.com/");
		
		//enter perfumes in search
		driver.findElement(By.name("searchVal")).sendKeys("Perfume");
		
		
		driver.findElement(By.className("ic-search")).click();
		
		
		
		//to capture title of current webpage
		String title = driver.getTitle();
		
		//to print in console
		System.out.println(title);
	}
}
