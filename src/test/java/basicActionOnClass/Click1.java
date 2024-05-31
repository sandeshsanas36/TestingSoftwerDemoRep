package basicActionOnClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		//step 1 create object of action class
		//step 2 
		
		Actions a = new Actions(driver);	 
				
		//step 3 identify targeted element
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign in']"));
		
		//step 4 call non static methods
		
		//a.click();
		
		a.click(button);
		
		a.perform();

	}

}
