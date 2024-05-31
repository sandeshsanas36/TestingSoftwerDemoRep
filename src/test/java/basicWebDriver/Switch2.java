package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch2 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		//launch application
		driver.get("https://www.ajio.com/");
		
		
				
		
		driver.findElement(By.name("searchVal")).sendKeys("Watches");
						
						
		driver.findElement(By.className("ic-search")).click();
		
		driver.findElement(By.cssSelector("img[alt='Product image of Skylona skm 9180 Analogue Watch with Deployant Clasp ']\r\n"
				+ "")).click();

		//to transfer the driver control parent window to child window
		
		//step 1 - how many window tab on there
		
		Set<String> id = driver.getWindowHandles();
		System.out.println(id);
		
		//step 2 for-Each loop when we have multiple windows
		
		for(String i : id)
		{
			//System.out.println(id);
			//String url = driver.getCurrentUrl();
			//System.out.println(url);
			
			String allUrl = driver.switchTo().window(i).getCurrentUrl();
			System.out.println(allUrl);
			
			String childUrl = "https://www.ajio.com/skylona-skm-9180-analogue-watch-with-deployant-clasp-/p/466296274_black";
			
			if (allUrl.contains("childUrl"))
			{
				break;
			}
		}
		
		
		driver.findElement(By.cssSelector("div[class='btn-gold']")).click();
		//driver.findElement(By.cssSelector("span[class='pdp-wishlist-desktop-icon']")).click();
		
		
		Thread.sleep(2000);
		
		//to transfer control from child window to parent window
		
		for (String r : id)
		{
			String Urlr = driver.switchTo().window(r).getCurrentUrl();
			System.out.println(Urlr);
			
			String parentUrlr ="https://www.ajio.com/s/watches-3991-60341?query=:relevance&classifier=intent";
			
			if (Urlr.contains(parentUrlr))
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();

	}

}
