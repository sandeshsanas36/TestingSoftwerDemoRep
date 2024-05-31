package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectItrrate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("‪file:///C:/Users/hp/Downloads/demo-1.html");
		
		driver.navigate().to("file:///C:/Users/hp/Downloads/demo-1.html");
		
		WebElement targetElement = driver.findElement(By.id("standard_cars"));
		
		Select sel = new Select (targetElement);
		
		java.util.List<WebElement> options = sel.getOptions();
		
		int i = 0;
		
		for(WebElement Web : options)
		{
			sel.selectByIndex(i++);
			
			Thread.sleep(1000);
		}
		

	}

}
