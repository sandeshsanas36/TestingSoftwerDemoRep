package basic1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("a[href='/digital-downloads']")).click();
		
		String Given_Data = "https://demowebshop.tricentis.com/digital-downloads";
		
		String Current_Url = driver.getCurrentUrl();
		
		if (Given_Data.equals(Current_Url))
		{
			System.out.println("You Are In Same Url");
		} else
		{
			System.out.println("You Are Not In Same Url");
		}
		
		WebElement sort_by = driver.findElement(By.id("products-orderby"));
		
		Select s = new Select(sort_by);
		
		List<WebElement> options = s.getOptions();
		
		int i = 0;
		
		for(WebElement web : options)
		{
			sort_by = driver.findElement(By.id("products-orderby"));
			
			s = new Select(sort_by);
			
			s.selectByIndex(i++);
		}
		
		WebElement Display = driver.findElement(By.id("products-pagesize"));
		
		Select D = new Select(Display);
		
		List<WebElement> Doptions = D.getOptions();
		
		int j = 0;
		
		for(WebElement web : Doptions)
		{
			Display = driver.findElement(By.id("products-pagesize"));
			
			D = new Select(Display);
			
			D.selectByIndex(j++);
		}
		
		WebElement View = driver.findElement(By.id("products-viewmode"));
		
		Select V = new Select(View);
		
		List<WebElement> Voptions = V.getOptions();
		
		int k = 0;
		
		for(WebElement web : Voptions)
		{
			View = driver.findElement(By.id("products-viewmode"));
			
			V = new Select(View);
			
			V.selectByIndex(k++);
		}
	}
}
