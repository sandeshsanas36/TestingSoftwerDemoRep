package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute1
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		String a = driver.findElement(By.id("username")).getAttribute("placeholder");
		
		System.out.println(a);
	}

}
