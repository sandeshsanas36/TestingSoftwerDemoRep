package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
//1		
//		//driver.findElement(By.xpath("//input[@placeholder,'Enter skills']")).sendKeys("JAVA");
//		
//		driver.findElement(By.xpath("(//input[@class='suggestor-input '])(1)")).sendKeys("Java");
		
		
		//login
		//id
		driver.findElement(By.id("login_Layer")).click();
		
		//csss
		driver.findElement(By.cssSelector("input[class='err-border']")).sendKeys("sanassandesh36@gmail.com");
		
		//css
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sandesh");
		
		//
		driver.findElement(By.xpath("Login")).click();
		
		
	}
}
