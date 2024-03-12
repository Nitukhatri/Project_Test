package Learning_Java;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class testingtools {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=testing+tools");
		driver.manage().window().maximize();
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("window.scrollBy(0,1100)");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@aria-label='15 more items']")).click();
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-300)");
		
		List<WebElement> tools = driver.findElements(By.xpath("//div[@jsname='jXK9ad']"));
		
		int pathcount=1;
		int imgpathcount=1;
		
		
		for(WebElement t : tools)
		{
			t.click();
			
			// Title
			String path = "(//div[@class='I506P IFnjPb']//a)["+ pathcount +"]"  ;
			
			String title = driver.findElement(By.xpath(path)).getText().toString();
			System.out.println(title);
			pathcount++;
			
			
		
			// Description
		//	List<WebElement> description = driver.findElements(By.xpath("(//div[@class='YbOmnd s0Odib wHYlTd']//div//span)"));
			
			List<WebElement> description = driver.findElements(By.xpath("(//div[@class='Ze3gdf']//span)"));
			
			for(WebElement d : description)
			{
				String des = d.getText().toString();
				
				String[] word = des.split(" ");
				
				if(word[0].contains(title))
				{	
					System.out.println(des);
					break;
					
				}			
			}
			
			// Image
			if(imgpathcount<=19)
			{
				String imgpath = "(//div[@jsname='jXK9ad']//img)["+imgpathcount+"]";
				
				String img = driver.findElement(By.xpath(imgpath)).getAttribute("src");
			
				System.out.println(img);
				imgpathcount++;
			}
			
		}
	
		driver.close();
	}

}
