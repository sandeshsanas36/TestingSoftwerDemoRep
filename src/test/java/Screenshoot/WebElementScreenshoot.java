package Screenshoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshoot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://www.redbus.in/");
		
		WebElement pushpa = driver.findElement(By.id("homeV2-root"));
		
		File from = pushpa.getScreenshotAs(OutputType.FILE);
		
		File to = new File("./Images/pushpa.png");
		
		FileHandler.copy(from, to);

	}

}
