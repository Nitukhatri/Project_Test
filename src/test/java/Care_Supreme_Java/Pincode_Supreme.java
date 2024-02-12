package Care_Supreme_Java;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pincode_Supreme {
	

	WebElement city;
	String pincode;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Pincode_Supreme(WebDriver driver,String Pincode) throws Exception 
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		city = driver.findElement(By.xpath("//input[@id='pincode_search']"));

		wait.until(ExpectedConditions.elementToBeClickable(city));		
		city.click();
		Thread.sleep(1000);


		city.sendKeys(Pincode);
		Thread.sleep(5000);

	//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='btn_custom view_quote']")))).click();
		driver.findElement(By.xpath("//a[@class='btn_custom view_quote']")).click();
		Thread.sleep(5000);
		

		driver.manage().window().fullscreen();
	//	driver.manage().deleteAllCookies();
//		driver.manage().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
}
