package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
		
		Thread.sleep(2000);
		
		Alert art = driver.switchTo().alert();
		
		art.accept();

	}

}
