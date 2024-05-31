package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		// to max the window
		driver.manage().window().maximize();
		
		//launch application
		driver.get("https://www.ajio.com/");
		
		//enter perfumes in search
		driver.findElement(By.name("searchVal")).sendKeys("Watches");
				
				
		driver.findElement(By.className("ic-search")).click();
		
		
		driver.findElement(By.cssSelector("img[alt='Product image of Skylona skm 9180 Analogue Watch with Deployant Clasp ']\r\n"
				+ "")).click();
		
		//handle();
//		//to capture id of cuurent window
//		String id = driver.getWindowHandle();
//		
//		System.out.println(id);
		
		//handles();
		 Set<String> id = driver.getWindowHandles();
		
		System.out.println(id);

	}

}
