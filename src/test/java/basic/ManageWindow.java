package basic;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow 
{
		public static void main(String[] args) 
		{
			ChromeDriver driver = new ChromeDriver();
			
			//driver.manage().window().maximize();
			
			//driver.manage().window().maximize();
			
			//driver.manage().window().fullscreen();


			driver.get("https://www.ajio.com/");
			
	//to get height and width of the window
//			Dimension a = driver.manage().window().getSize();
//			
//			System.out.println(a.getWidth());
//			System.out.println(a.getHeight());
			
			
			
	// to set height and width of the window
			
			
//			Dimension d = new Dimension(500,800);
//			driver.manage().window().setSize(d);
			
			
			// to get x and y value
			
		    Point p = driver.manage().window().getPosition();
			System.out.println(p.getX());
			System.out.println(p.getY());
			
//			
//			// to set x and y value
//			
//			Point q = new Point(200,400);
//			driver.manage().window().setPosition(q);
			
		}
}



 