package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClick {

	public static void main(String[] args) throws InterruptedException 
	{
		String Signuplink = "https://login.oracle.com/mysso/signon.jsp";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://www.oracle.com/in/java/technologies/downloads/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement jdk1se8 = driver.findElement(By.xpath("//a[text()='jdk-8u411-linux-x64.tar.gz']"));
		
		js.executeAsyncScript("arguments[0].scrollIntoView(false);", jdk1se8);
		
		Thread.sleep(2000);
		
		jdk1se8.click();
		
		Thread.sleep(2000);
		
		WebElement disable_element = driver.findElement(By.linkText("Download jdk-8u411-linux-x64.tar.gz"));
		
		js.executeScript("argumrnts[0].click();", disable_element);
		
		String CurrentUrl = driver.getCurrentUrl();
		
		if (Signuplink.equals(CurrentUrl)) 
		{
			System.out.println("My Script Is Successfull....!!!!!");
		} 
		else 
		{
			System.out.println("My Script Is UnSuccessfull....!!!!!");
		}
		

	}

}
