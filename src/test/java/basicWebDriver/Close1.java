package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		//launch application
		driver.get("https://www.ajio.com/");
				
		
		driver.findElement(By.name("searchVal")).sendKeys("Watches");
						
						
		driver.findElement(By.className("ic-search")).click();
		
		driver.findElement(By.cssSelector("img[alt='Product image of Skylona skm 9180 Analogue Watch with Deployant Clasp ']\r\n"
				+ "")).click();
		
		Thread.sleep(2000);
		//driver.close();
		
		driver.quit();

	}

}
