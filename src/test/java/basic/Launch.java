package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch
{
	public static void main(String[] args) 
	{
		//Launch empty Chrome browser
		//EdgeDriver driver = new EdgeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");	
		
	}
}
