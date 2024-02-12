package Care_Advantage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KYC_Verification {

	static String KYC_Verification_msg;
	
	
	
	public void name() {
	}
	
	public static void KYC_Verification_PAN(WebDriver driver) throws Exception 
	{
		Thread.sleep(1000);

		// PAN Verification

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
			
		driver.findElement(By.xpath("//input[@id='kyc_pan']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='pan_no']")).sendKeys("DUUPG3251C");
		Thread.sleep(1000);

		WebElement KYCDOB = driver.findElement(By.xpath("//div//input[@id='pan_dob']"));

		KYCDOB.sendKeys("04");
		KYCDOB.sendKeys("01");
		KYCDOB.sendKeys("2001");   
	
		Thread.sleep(1000);
		
		
		do
		{
			
			Thread.sleep(1000);
				
					
			     // PAN Verification
			
			driver.findElement(By.xpath("(//div//button[@class='verify_btn'])[1]")).click();
			

			Thread.sleep(10000);
	
			KYC_Verification_msg = driver.findElement(By.xpath("//div[@id='pan_verify']")).getText().toString();
			
			System.out.println(KYC_Verification_msg + "KYV msg");
			
		}while(!KYC_Verification_msg.contentEquals("Verification Successful!"));

	}
	
	
	public static void KYC_Verification_By_Others(WebDriver driver) throws Exception
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
		
		// Other KYC verification
				driver.findElement(By.xpath("(//label//span[@class='radio_checkmark'])[3]")).click();
				
				Thread.sleep(1000);
				
				new Select(driver.findElement(By.xpath("//select[@class='proof_type']"))).selectByValue("pan");
				Thread.sleep(500);

				Robot robot = new Robot();
				
				
				
				
				do
				{
					
					driver.findElement(By.xpath("(//div[@class='upload_pan']//span)[1]")).click();
									
					robot.delay(1000);
					
					// copy file to clip board
					StringSelection ss= new StringSelection("C:\\Users\\nitu2\\Pictures\\Screenshots\\Screenshot (22)");
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
					
					// perform control + V to pase file
					
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_V);
					
					robot.keyPress(KeyEvent.VK_ENTER);					
					robot.keyRelease(KeyEvent.VK_ENTER);
					

				//	Thread.sleep(15000);
		

					wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='upload_pan']//span)[2]")))).isDisplayed();

					driver.manage().window().fullscreen();		
					

					KYC_Verification_msg =	driver.findElement(By.xpath("(//div[@class='upload_pan']//span)[2]")).getText().toString();
										
					System.out.println(KYC_Verification_msg + " : KYC msg");
				
				
				}while(!KYC_Verification_msg.contentEquals("File uploaded Successfully!"));

				Thread.sleep(1000);
				
				new Select(driver.findElement(By.xpath("//select[@class='proof_type_address']"))).selectByValue("passport");
				Thread.sleep(500);
				
				do
				{
					
					driver.findElement(By.xpath("(//div[@class='upload_passport_address']//span)[1]")).click();
	
					robot.delay(1000);
					
					// copy file to clip board
					StringSelection ss= new StringSelection("C:\\Users\\nitu2\\Pictures\\Screenshots\\Screenshot (22)");
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
					
					// perform control + V to pase file
					
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_V);
					
					robot.keyPress(KeyEvent.VK_ENTER);					
					robot.keyRelease(KeyEvent.VK_ENTER);
						
					Thread.sleep(10000);
		
					wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='upload_passport_address']//span)[2]")))).isDisplayed();

					driver.manage().window().fullscreen();		

					
					KYC_Verification_msg =	driver.findElement(By.xpath("(//div[@class='upload_passport_address']//span)[2]")).getText().toString();
					
					System.out.println(KYC_Verification_msg + " : KYC msg");
				
				
				}while(!KYC_Verification_msg.contentEquals("File uploaded Successfully!"));
				
				
				
	}

}
