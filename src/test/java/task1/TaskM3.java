package task1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskM3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List <WebElement> cp = driver.findElements(By.xpath("//div[@id='poll-block-1']/ul/li/input"));
		
		for(WebElement web : cp )
		{
			web.click();
			
			Thread.sleep(2000);
		}
		
		List <WebElement> text = driver.findElements(By.xpath("//div[@id='poll-block-1']/ul/li/label"));
		
		for(WebElement web : text )
		{
			System.out.println(web.getText());
			
			Thread.sleep(2000);
		} 
	}

}
