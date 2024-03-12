package Testing;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

   public static WebDriver driver = new ChromeDriver();
	    
   public DemoBlaze() 
   {
	   	driver.manage().window().maximize();
	    driver.navigate().to("https://www.demoblaze.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
   

}
