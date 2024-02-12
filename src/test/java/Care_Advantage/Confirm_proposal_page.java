package Care_Advantage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Confirm_proposal_page {

	static String Premium_Edit_Quote;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public Confirm_proposal_page(WebDriver driver) throws Exception 
	{
		
		Thread.sleep(2000);
		Premium_Edit_Quote = driver.findElement(By.xpath("//span[@class='premium_total total_premium_top']")).getText();
		System.out.println("Premium on Edit Quote :  " + Premium_Edit_Quote);
		Thread.sleep(1000);
		
		WebElement standardpaybtn = driver.findElement(By.xpath("//div/a[@class='link_brown']"));
		Thread.sleep(2000);
		standardpaybtn.click();
		Thread.sleep(1000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
	
	}
	
}
