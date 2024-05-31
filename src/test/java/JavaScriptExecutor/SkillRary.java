package JavaScriptExecutor;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SkillRary 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://www.skillrary.com/");
		
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		
		WebElement option = driver.findElement(By.xpath("//i[@class='fa fa-certificate']"));
		
		ac.moveToElement(option).perform();
		
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[1]")).click();
		
		Set <String>id = driver.getWindowHandles();
		
		int i = 0;
		
		for(String win : id)
		{
			if(i==1)
			{
				driver.switchTo().window(win);
				
				WebElement DisableElement = driver.findElement(By.xpath("//input[@class='form-control']"));
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				js.executeScript("arguments[0].value='abcd';", DisableElement);
			}
			i++;
		}
		
	}

}
