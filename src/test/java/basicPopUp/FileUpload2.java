package basicPopUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.freepdfconvert.com/");
		
		driver.findElement(By.cssSelector("a[class='btn-wrapper upload-btn']")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\\\AUTOMATION TESTING\\\\upload2.exe");
	}

}
