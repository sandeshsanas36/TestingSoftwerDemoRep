package basicPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivision1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("login_Layer")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("Sandesh@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Sandesh123");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

}
