package Care_Supreme_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class Get_Quote_Section {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Get_Quote_Section(WebDriver driver, String mobile_number) throws Exception
	{
			Thread.sleep(1000);
			if(mobile_number != "0")
			{
	        WebElement Mobile_Number_Field = driver.findElement(By.xpath("//input[@id='mobile_no']"));
	        Mobile_Number_Field.sendKeys(mobile_number);
	        Thread.sleep(1000);
		//	WebElement Calculate_Premium_btn = driver.findElement(By.xpath("//button[@class='btn_custom quote_btn']"));
	        WebElement Calculate_Premium_btn = driver.findElement(By.xpath("//button[@class='btn_custom quote_btn custum_common_btn']"));
	        Calculate_Premium_btn.click();
			}
			else
			{
				System.out.println("Mobile number is not given in Sheet");
			}
			Thread.sleep(1000);
	}

}
