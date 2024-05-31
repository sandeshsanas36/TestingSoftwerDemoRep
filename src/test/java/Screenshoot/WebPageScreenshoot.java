package Screenshoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshoot 
{
	public static void main(String[] args) throws IOException 
	{
		LocalDateTime DT = LocalDateTime.now();
		
		String NDT = DT.toString().replace(":", "-");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("-disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File from = ss.getScreenshotAs(OutputType.FILE);
		
		File to = new File(".\\Images\\redbus"+NDT+".png");
		
		FileHandler.copy(from, to);
		
	}
	
}