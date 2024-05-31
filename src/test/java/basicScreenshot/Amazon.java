package basicScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 

{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot s1 = (TakesScreenshot)driver;
		
		File f1 = s1.getScreenshotAs(OutputType.FILE);
		
		File f2 = new File("./Images/amazon.png");
		
		FileUtils.copyFile(f1, f2);

	}

}







