package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssign 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("input[class='Pke_EE']")).sendKeys("Samsung s23");
		
		driver.findElement(By.cssSelector("button[class='_2iLD__']")).click();
		
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 5G (Phantom Black, 256 GB)']")).click();	}
}
