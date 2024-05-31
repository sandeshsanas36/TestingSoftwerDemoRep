package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://licindia.in/");

		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=' Login ']")).click();
		
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
		System.out.println(driver.switchTo().alert().getText());
	}
}
