package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected1
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/radio");
		
		boolean a = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		
		System.out.println(a);
		
		boolean b = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
		
		System.out.println(b);
	}

}
