package basicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		
		// to max the window
		driver.manage().window().maximize();
		
		//launch application
		driver.get("https://www.ajio.com/");
		
		//to get current url
		String url = driver.getCurrentUrl();
		
		//to print url
		System.out.println(url);

	}

}
