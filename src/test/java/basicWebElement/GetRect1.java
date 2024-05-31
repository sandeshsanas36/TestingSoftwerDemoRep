package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		org.openqa.selenium.Rectangle a = driver.findElement(By.xpath("//button[text()='Sign in']")).getRect();
		
		System.out.println(a.getHeight());
		
		System.out.println(a.getWidth());
		
		System.out.println(a.getX());
		
		System.out.println(a.getY());
	}

}
