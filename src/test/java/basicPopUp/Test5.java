package basicPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.justdial.com/");
		
		Thread.sleep(4000);
		
		//create Object of Robot class
		
		Robot r = new Robot();
		
		//call keyPress and KeyRealse()
		
		//control will be on close
		r.keyPress(KeyEvent.VK_TAB);		
		
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(4000);
		
		//click on enter button	
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
