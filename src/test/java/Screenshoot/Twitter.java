package Screenshoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Twitter {

	public static void main(String[] args) throws IOException 
	{
		LocalDateTime DT = LocalDateTime.now();
		
		String NDT = DT.toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://twitter.com/?lang=en");
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("sandesh_36");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("SandeshSanas@36");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		//driver.findElement(By.xpath("//a[@href='/explore']")).click();
		
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("ImRo45");
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='@ImRo45']")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@data-testid='TypeaheadUser'])[1]")));
		
		
		driver.findElement(By.xpath("(//div[@data-testid='TypeaheadUser'])[1]")).click();
		
//		Actions at = new Actions(driver);
//		
//		at.keyDown(Keys.DOWN);
		
		driver.findElement(By.xpath("//img[@src='https://pbs.twimg.com/media/GJhPJfuXMAEGHgP?format=jpg&name=small']")).click();
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File from = ss.getScreenshotAs(OutputType.FILE);
		
		File to = new File(".\\Images\\RohitSharma"+NDT+".png");
		
		FileHandler.copy(from, to);
		
	}

}
