package Care_Advantage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Proposer_detail_page {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public Proposer_detail_page(WebDriver driver) throws Exception
	{
		
		Actions action = new Actions(driver);
			
		//KYC_Verification.KYC_Verification_PAN(driver);
		
		KYC_Verification.KYC_Verification_By_Others(driver);

		Thread.sleep(1000);
		
		WebElement First_name = driver.findElement(By.xpath("//input[@id='first_name']"));
		First_name.clear();
		First_name.sendKeys("Nitu");
		Thread.sleep(1000);
		
		WebElement last_name= driver.findElement(By.xpath("//div/input[@id='last_name']"));
		last_name.clear();
		last_name.sendKeys("Last Name"); 		
		Thread.sleep(100);
		
		WebElement DOB = driver.findElement(By.xpath("//input[@id='dob']"));
		DOB.sendKeys("11");
		DOB.sendKeys("11");
		DOB.sendKeys("1990");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("//div/input[@id='email_id']"));
		email.clear();
		email.sendKeys("nitu2@careinsurance.com");
		Thread.sleep(100);
		
		WebElement emergency_number = driver.findElement(By.xpath("//div/input[@id='EmergencyMobileNumber']"));
		emergency_number.clear();
		emergency_number.sendKeys("9087654321"); 
		Thread.sleep(100);
		
		WebElement address_line1 = driver.findElement(By.xpath("//div/input[@id='addressLine1']"));
		address_line1.clear();
		address_line1.sendKeys("Address Line1");
		Thread.sleep(100);
		
		WebElement address_line2 = driver.findElement(By.xpath("//div/input[@id='addressLine2']"));
		address_line2.clear();
		address_line2.sendKeys("Address Line2");
		Thread.sleep(100);

		WebElement landmark = driver.findElement(By.xpath("//div/input[@id='landmark']"));
		landmark.clear();
		landmark.sendKeys("landmark"); 
		Thread.sleep(1000);
		
		 String Pan_available =  driver.findElement(By.xpath("//input[@id='pan_number_required']")).getAttribute("value");

		 Thread.sleep(100);
		 
		 if(!Pan_available.contentEquals("0"))
		 {
			 driver.findElement(By.xpath("//input[@id='pancard_number']")).sendKeys("duupg3251c");
		 }
		 
		//scroll down a page
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(200);

		
		driver.findElement(By.xpath("//input[@id='cores_address_same_as']")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		
		//scroll down a page
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		WebElement nominee_name = driver.findElement(By.xpath("//div/input[@id='nominee_name']"));
		nominee_name.sendKeys("Nominee");
		Thread.sleep(1000);
		
		WebElement DOB_nominee = driver.findElement(By.xpath("//input[@id='nomineeDob']"));
		DOB_nominee.sendKeys("11");
		DOB_nominee.sendKeys("11");
		DOB_nominee.sendKeys("1990");
		Thread.sleep(1000);
		
	
		//scroll down a page
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(500);
		
		WebElement Nominee_relation = driver.findElement(By.xpath("//div[@class='relation_dropdown custom_dropdown nominee_relation']"));
		Nominee_relation.click();
		Thread.sleep(1000);

		
		List<WebElement> Nominee_select = driver.findElements(By.xpath("//div[@class='form_input borderdinput drop_cont relation_input relation_input_width in']//ul//li"));
		Thread.sleep(1000);
		
		for(WebElement e : Nominee_select)
		{ 
			if(e.getText().toString().contentEquals("Spouse")) 
			{
				e.click();
				break;
			}
		}
		
	    // Back button
        driver.findElement(By.xpath("//a[@class='btn_comon']"));
        Thread.sleep(1000);
    
        // Next button
        driver.findElement(By.xpath("//button[@class='btn_comon kyc_validation_next green_btn proposerDetailsForm']")).click();
	}

	
	
}
