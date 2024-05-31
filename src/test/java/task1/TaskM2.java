package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskM2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("$25 Virtual Gift Card")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Abhi");
		
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("abhi123@gmail.com");
		
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Sandesh");
		
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("sandesh123@gmail.com");
		
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Card For You");
		
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("5");	
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		//Thread.sleep(2000);
		
		 WebElement product = driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[2]"));
		 
		 Thread.sleep(2000);
		
		if(product.isDisplayed())
		{
			
			System.out.println("product is Added");
			
		}
		else
		{
			System.out.println("Cart is Empty");
		}
		
		

	}

}
