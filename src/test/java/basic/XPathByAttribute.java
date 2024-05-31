package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByAttribute
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JS/AT.html");
		
		//driver.findElement(By.cssSelector("//input[@value='A' and @type='text']"));
	}
}
