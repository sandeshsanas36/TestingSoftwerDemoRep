package PopUp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileAttachment 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		
		Actions a = new Actions(driver);
		
		a.keyUp(Keys.DOWN);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h2[@class='main-3'])[1]")));
		
		driver.findElement(By.xpath("(//h2[@class='main-3'])[1]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Upload Resume']")));
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("‪File\\C:\\Users\\hp\\Desktop\\Sandesh Sanas Bsc (cs) Final Result.pdf");
		
		
	}
}
	