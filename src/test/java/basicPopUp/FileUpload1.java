package basicPopUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("file_wraper0")).click();
		
		Thread.sleep(4000);

		
		//step 2 autoit tool
		
		Runtime.getRuntime().exec("D:\\AUTOMATION TESTING\\Upload.exe");
	}

}
