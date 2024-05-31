package basicJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		//step 1  downcast javascript executor 
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollTo(0,2000)");	//vertical scrolling top to bottom
		
		Thread.sleep(2000);
		
		jse.executeScript("window.sccrollTo(0,-500)");	//vertical scrolling bottom to top
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollTo(900,0)");	//horizontal scrolling left to right
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollTo(-300,0)");	//horizontal scrolling right to lefft
		
		Thread.sleep(2000);
	}

}
