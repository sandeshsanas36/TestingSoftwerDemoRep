package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed1
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		boolean a = driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
		
		System.out.println(a);
		
		boolean b = driver.findElement(By.name("login")).isDisplayed();
		
		System.out.println(b);

	}

}
