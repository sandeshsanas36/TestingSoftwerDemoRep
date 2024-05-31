package ActionClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions(driver);
		
		java.util.List<WebElement> Target_Element = driver.findElements(By.xpath("//div[@class='desktop-navContent']"));
		
		for(WebElement web : Target_Element)
		{
			act.moveToElement(web).build().perform();
			
			Thread.sleep(2000);
		}

	}

}
