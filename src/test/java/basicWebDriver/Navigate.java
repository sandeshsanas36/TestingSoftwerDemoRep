package basicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		// to max the window
		driver.manage().window().maximize();
		
//		//launch application
//		driver.get("https://www.ajio.com/");
//		
//		//enter perfumes in search
//		driver.findElement(By.name("searchVal")).sendKeys(perfume);
//		
//		//Search perfu
//		driver.findElement(By.className("ic-search")).click();
		
		
		driver.navigate().to("https://www.ajio.com/s/perfumes-4405-57701?query=:relevance&classifier=intent");
		
	}

}
