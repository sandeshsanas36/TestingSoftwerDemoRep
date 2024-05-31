package basicActionOnClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover3
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		Actions a = new Actions(driver);
		
		a.moveByOffset(90, 300).contextClick().build();
	}
	
}