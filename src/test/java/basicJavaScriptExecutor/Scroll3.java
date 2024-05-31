package basicJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		//step 1  downcast javascript executor 
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollTo(0,docyment.body.scrollHeight)");	//complete scrolling form top to bottom
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollTo(0,-docyment.body.scrollHeight)");	//complete scrolling form bottom to top
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollTo(0,docyment.body.scrollWidth,0)");	//complete scrolling form left to right
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollTo(0,-docyment.body.scrollWidth,0)");	//complete scrolling form right to left
		
		Thread.sleep(2000);
	}

}
