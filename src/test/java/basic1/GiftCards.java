package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCards 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Gift Cards")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("$5 Virtual Gift Card")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[class='recipient-name']")).sendKeys("Deepak");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='giftcard_1.RecipientEmail']")).sendKeys("Deepak123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='giftcard_1.SenderName']")).sendKeys("Sandesh");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='giftcard_1.SenderEmail']")).sendKeys("sandesh123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("textarea[class='message']")).sendKeys("Gift Card");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("addtocart_1_EnteredQuantity")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("addtocart_1_EnteredQuantity")).sendKeys("5");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-button-1")).click();
		
	}

}
