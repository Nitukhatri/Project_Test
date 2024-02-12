package Care_Advantage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sum_Insured_Selection_Advantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Sum_Insured_Selection_Advantage(WebDriver driver, String SI) throws Exception 
	{
		// TODO Auto-generated constructor stub
	
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		if(SI.contentEquals("25"))
		{
			driver.findElement(By.xpath("//div//span[text()='0']")).click();
			Thread.sleep(5000);
		}
		
		if(SI.contentEquals("50"))
		{
			driver.findElement(By.xpath("//div//span[text()='1']")).click();
			Thread.sleep(5000);
		}
		
		if(SI.contentEquals("100"))
		{
			driver.findElement(By.xpath("//div//span[text()='2']")).click();
			Thread.sleep(5000);
		}
		
		if(SI.contentEquals("200"))
		{
			driver.findElement(By.xpath("//div//span[text()='3']")).click();
			Thread.sleep(5000);
		}
		
		if(SI.contentEquals("300"))
		{
			driver.findElement(By.xpath("//div//span[text()='4']")).click();
			Thread.sleep(5000);
		}
		
		

		
	//	if(SI.contentEquals("600"))
//		{
			
			
			//driver.findElement(By.xpath("//div//span[text()='600 L']")).click();
//			WebElement slider = driver.findElement(By.xpath("//div[@class='form_input suminsured_cont']"));
//			slider.sendKeys(Keys.BACK_SPACE);
//			slider.sendKeys("100");
		//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div//span[text()='5']")))).click();

			
//			Thread.sleep(5000);
			
			
//		}
	}
}
