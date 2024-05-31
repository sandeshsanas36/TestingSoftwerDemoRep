package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheTextPrice
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
		Thread.sleep(2000);
		
		WebElement music2 = driver.findElement(By.xpath("(//a[text()='Music 2']/../../div[3]/div[1]/span)[1]"));
		
		System.out.println(music2.getText());
		
		WebElement music22 = driver.findElement(By.xpath("(//a[text()='Music 2']/../../div[3]/div[1]/span)[2]"));
		
		System.out.println(music22.getText());

	}

}
