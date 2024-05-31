package WebDrivverWaitingComments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://omayo.blogspot.com/");	
		
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
		
		driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
		
		driver.navigate().back();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		
		driver.findElement(By.id("timerButton")).click();
		
		driver.switchTo().alert().accept();
		
	}

}
