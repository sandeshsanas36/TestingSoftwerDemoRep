package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUsingWebElement
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		WebElement Icon = driver.findElement(By.xpath("//div[@class='header-logo']"));
		
		if(Icon.isDisplayed())
		{
			System.out.println("You are in ds");
		}
		else
		{
			System.out.println("Not");
		}
	}

}



