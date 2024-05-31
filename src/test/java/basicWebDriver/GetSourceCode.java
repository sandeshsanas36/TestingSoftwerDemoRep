package basicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourceCode 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		// to max the window
		driver.manage().window().maximize();
		
		//launch application
		driver.get("https://www.ajio.com/");
		
		//to capture source code of current web page
		String SourceCode = driver.getPageSource();
		
		//to print source code
		System.out.println(SourceCode);

	}

}
