package Project_Test.Project_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement mainSlider =	driver.findElement(By.xpath("//div[@id='slider']"));
		WebElement Slider =	driver.findElement(By.xpath("//div[@id='slider']//span"));
		
//		new Actions(driver).dragAndDrop(mainSlider, Slider);
	
		new Actions(driver).dragAndDropBy(Slider, 200, 0).perform();
		
	}

}
