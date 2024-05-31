package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
		
		driver.findElement(By.cssSelector("button[onclick=\"promptbox()\"]")).click();
		
		Thread.sleep(2000);
		
		Alert art = driver.switchTo().alert();
		
		System.out.println(art.getText());
		
		art.sendKeys("Sandesh");
		
		Thread.sleep(2000);
		
		art.accept();
		
		//art.dismiss();
	}

}
