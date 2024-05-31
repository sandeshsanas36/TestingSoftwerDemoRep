package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddBusCalendar 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
//		ChromeOptions options = new ChromeOptions();
		
//		options.addArguments("-disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(8000);
		
		Robot r = new Robot();
		
		//call keyPress and KeyRealse()
		
		//control will be on close
		r.keyPress(KeyEvent.VK_TAB);		
		
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(4000);
		
		//click on enter button	
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='dateText']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 gigHYE']")).click();
		
		

	}

}
