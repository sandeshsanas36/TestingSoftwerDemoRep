package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Sandesh");
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Sanas");
		
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Pune");
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("sandesh123@gmail.com");
		
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9403354842");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		driver.findElement(By.cssSelector("input[id='checkbox1']")).click();
		
		driver.findElement(By.cssSelector("div[id='msdd']")).click();
		
		driver.findElement(By.xpath("//div[@style='display: block;']/ul/li[8]")).click();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		
		Select sel = new Select(skills);
		
		sel.selectByVisibleText("Java");
		
		//driver.findElement(By.xpath("//select[@id='Skills']/option[39]")).click();
		
		//driver.findElement(By.cssSelector("select[id='countries']")).click();
		
		//driver.findElement(By.xpath("//span[@role='combobox']")).click();
		
		WebElement 	country = driver.findElement(By.cssSelector("span[role='combobox']"));
		
		Thread.sleep(2000);
		
		Select sel1 = new Select(country);
		
		sel1.selectByVisibleText("India");
		
		//driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[6]")).click();
		
		WebElement year = driver.findElement(By.id("yearbox"));
		
		Select sel2 = new Select(year);
		
		sel2.selectByVisibleText("2002");
		
		//driver.findElement(By.xpath("//select[@id='yearbox']/option[88]")).click();
		
		WebElement month = driver.findElement(By.cssSelector("select[placeholder='Month']"));
		
		Select sel3 = new Select(month);
		
		sel3.selectByVisibleText("July");
		
		//driver.findElement(By.xpath("//select[@placeholder='Month']/option[8]")).click();
		
		WebElement date = driver.findElement(By.id("daybox"));
		
		Select sel4 = new Select(date);
		
		sel4.selectByVisibleText("29");
		
		//driver.findElement(By.xpath("//select[@id='daybox']/option[30]")).click();
		
		driver.findElement(By.cssSelector("input[id='firstpassword']")).sendKeys("Sandesh123");
		
		driver.findElement(By.cssSelector("input[id='secondpassword']")).sendKeys("Sandesh123");
		
		driver.findElement(By.cssSelector("button[id='submitbtn']")).click();

	}

}
