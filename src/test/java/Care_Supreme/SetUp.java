package Care_Supreme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SetUp {

	public static WebDriver driver = new ChromeDriver();
	
	@Test
//	@Parameters({"Browser","url"})
	public void SetUp()
	{
		driver.get("https://www.careinsurance.com/product/care-supreme");
		driver.manage().window().fullscreen();
	}
	 datademo d = new datademo("oiuytrertyuiuytre");
	 datademo d1 = new datademo("oiuytrertyuiuytre",876543);
	 datademo d3 = new datademo("String 2");
	 datademo d4 = new datademo("String 3");	 
	 
}
