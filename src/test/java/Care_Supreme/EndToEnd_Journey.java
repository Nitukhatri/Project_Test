package Care_Supreme;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EndToEnd_Journey extends SetUp {

	public static WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	

	@Test(priority = 1, dataProviderClass = Data_Provider.class, dataProvider = "get_mobile_number")
	public void get_quote(String mobile_number) throws Exception
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn_sticky_mobile btn_custom quote_btn custum_common_btn']")));
	    WebElement Mobile_Number_Field = driver.findElement(By.xpath("//input[@id='mobile_no']"));
        Mobile_Number_Field.sendKeys(mobile_number);
        Thread.sleep(1000);
        WebElement Calculate_Premium_btn = driver.findElement(By.xpath("//button[@class='btn_sticky_mobile btn_custom quote_btn custum_common_btn']"));
        Calculate_Premium_btn.click();
	}
	
	
	@Test(priority = 2, dataProviderClass = Data_Provider.class, dataProvider = "member_selection", dependsOnMethods = "get_quote" )
	public void Member_Selection(String Self,String Spouse,String Son, String Daughter) throws Exception 
	{	
			
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='self']")));
		
		String member_pre_selection_value = driver.findElement(By.xpath("//div//input[@id='self']")).getAttribute("value");
		System.out.println(member_pre_selection_value + " : self");
		
		if(member_pre_selection_value.contentEquals("1"))
		{
			driver.findElement(By.xpath("//label[@for='self']")).click();
			Thread.sleep(500);
		}	
		
		if(Self != null)
		{
			driver.findElement(By.xpath("//label[@for='self']")).click();
			Thread.sleep(500);
		}
				
		if(Spouse != null)
		{
			driver.findElement(By.xpath("//label[@for='spouse']")).click();
			Thread.sleep(500);
		}
		
		if(Son != null)
		{
			driver.findElement(By.xpath("//label[@for='son']")).click();
			Thread.sleep(500);
		}
		
		if(Daughter != null)
		{
			driver.findElement(By.xpath("//label[@for='daughter']")).click();
			Thread.sleep(500);
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn_sticky_mobile btn_custom step2_continue custum_common_btn']")));
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn_sticky_mobile btn_custom step2_continue custum_common_btn']"));
		btn.click();
	}
	
	
	@Test(priority = 3, dataProviderClass = Data_Provider.class, dataProvider = "members_age", dependsOnMethods = "Member_Selection")
	public void members_age_section(String Self, String Spouse, String Son, String Daughter) throws Exception 
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn_sticky_mobile btn_custom step3_continue custum_common_btn']")));
				
		if(Self != null)
		{
			new Select(driver.findElement(By.xpath("//select[@id='self']"))).selectByValue(Self);
			Thread.sleep(500);
		}
				
		if(Spouse != null)
		{
			new Select(driver.findElement(By.xpath("//select[@id='spouse']"))).selectByValue(Spouse);
			Thread.sleep(500);
		}
		
		if(Son != null)
		{
			new Select(driver.findElement(By.xpath("//select[@id='son']"))).selectByValue(Son);
			Thread.sleep(500);
		}

		if(Daughter != null)
		{
			new Select(driver.findElement(By.xpath("//select[@id='daughter']"))).selectByValue(Daughter);
			Thread.sleep(500);
		}
				
		driver.findElement(By.xpath("//button[@class='btn_sticky_mobile btn_custom step3_continue custum_common_btn']")).click();
	}


	
	@Test(priority = 4, dataProviderClass = Data_Provider.class, dataProvider ="get_pincode", dependsOnMethods = "members_age_section")
	public void pincode(String pin_code) throws Exception
	{

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pincode_search']")));
		driver.findElement(By.xpath("//input[@id='pincode_search']")).sendKeys(pin_code);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='material-icons success_icon_span pin_code_success_icon_span']")));
		driver.findElement(By.xpath("//button[@class='btn_sticky_mobile btn_custom view_quote custum_common_btn']")).click();

		Thread.sleep(5000);
	}
	
	
	
	@Test(priority = 5, dependsOnMethods = "pincode")
	public void buy_now() 
	{
		driver.manage().window().fullscreen();	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='buy_for_btn']"))).click();
	
	}
	
	
	@Test(priority = 6, dependsOnMethods = "buy_now")
	public void Confirm_proposal_page() throws Exception
	{
		driver.manage().window().fullscreen();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Continue with detailed form to pay']")));
		WebElement btn = driver.findElement(By.xpath("//a[text()='Continue with detailed form to pay']"));
		btn.click();
	}
	
	
	
	@Test(priority = 7, dependsOnMethods = "Confirm_proposal_page")
	public static void KYC_Verification_PAN() throws Exception 
	{
		Thread.sleep(1000);

		driver.manage().window().fullscreen();
		// PAN Verification

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='kyc_item ekyc_pan']//span"))).click();
	//	driver.findElement(By.xpath("//input[@id='kyc_pan']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='pan_no']")).sendKeys("DUUPG3251C");
		Thread.sleep(1000);

		WebElement KYCDOB = driver.findElement(By.xpath("//div//input[@id='pan_dob']"));

		KYCDOB.sendKeys("04");
		KYCDOB.sendKeys("01");
		KYCDOB.sendKeys("2001");   
	
		Thread.sleep(1000);
		
		String KYC_Verification_msg = null;
		do
		{	
			Thread.sleep(1000);		
			     // PAN Verification
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//button[@class='verify_btn'])[1]"))).click();
			
		//	driver.findElement(By.xpath("(//div//button[@class='verify_btn'])[1]")).click();
			
		//	Thread.sleep(10000);
	
			KYC_Verification_msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='pan_verify']"))).getText().toString();
		
			//	KYC_Verification_msg = driver.findElement(By.xpath("//div[@id='pan_verify']")).getText().toString();
			
			System.out.println(KYC_Verification_msg + "KYV msg");
			
		}while(!KYC_Verification_msg.contentEquals("Verification Successful!"));
	}
	
	
	  static Actions action = new  Actions(driver);
	
	@Test(priority = 8, dependsOnMethods = "KYC_Verification_PAN")
	public void proposal_details() throws Exception
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn_comon kyc_validation_next green_btn proposerDetailsForm']")));
		
		Thread.sleep(1000);
		WebElement last_name= driver.findElement(By.xpath("//div/input[@id='last_name']"));
		last_name.clear();
		last_name.sendKeys("Last Name"); 		
		Thread.sleep(100);
		
		WebElement email = driver.findElement(By.xpath("//div/input[@id='email_id']"));
		email.clear();
		email.sendKeys("nitu2@careinsurance.com");
		Thread.sleep(100);
		
		WebElement emergency_number = driver.findElement(By.xpath("//div/input[@id='EmergencyMobileNumber']"));
		emergency_number.clear();
		emergency_number.sendKeys("9087654321"); 
		Thread.sleep(100);
		
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
		
		WebElement DOB = driver.findElement(By.xpath("//input[@id='nomineeDob']"));
		DOB.sendKeys("11");
		DOB.sendKeys("11");
		DOB.sendKeys("1990");
		Thread.sleep(1000);
		
	
		//scroll down a page
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(500);
		
		WebElement Nominee_relation = driver.findElement(By.xpath("//div[@class='relation_dropdown custom_dropdown nominee_relation']"));
		Nominee_relation.click();
		Thread.sleep(1000);

		
		List<WebElement> Nominee_select = driver.findElements(By.xpath("(//div[@class='nominee nominee_in divide_border'])//ul//li"));
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
    //    driver.findElement(By.xpath("//a[@class='btn_comon']"));
        Thread.sleep(1000);
    
        // Next button
        driver.findElement(By.xpath("//button[@class='btn_comon kyc_validation_next green_btn proposerDetailsForm']")).click();
	}
	
	@Test(priority = 10,dataProviderClass = Data_Provider.class ,dataProvider = "insured_member_age", dependsOnMethods = "proposal_details")
	public void Insured_Member_Detail_Page(String Self_DOB, String Spouse_DOB,String Son_DOB,String Daughter_DOB) throws Exception 
	{
		// TODO Auto-generated constructor stub
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn_comon green_btn createPolicySubmit insuredDetailsForm']")));
		WebElement first_name,last_name,Member_dob,height_feet,height_inches,weight;
		
		if(Self_DOB != "0")
		{	
			// Self Details
			first_name = driver.findElement(By.xpath("//input[@name='insured_members[self][first_name]']"));
			first_name.clear();
			first_name.sendKeys("Self");
			Thread.sleep(100);

			last_name = driver.findElement(By.xpath("//input[@name='insured_members[self][last_name]']"));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[self][insured_dob]']"));
			Member_dob.clear();
			Member_dob.sendKeys(Self_DOB);
			Thread.sleep(100);

			height_feet = driver.findElement(By.xpath("//input[@name='insured_members[self][height_feet]']"));
			height_feet.clear();
			height_feet.sendKeys("5");		
			Thread.sleep(100);

			height_inches = driver.findElement(By.xpath("//input[@name='insured_members[self][height_inches]']"));
			height_inches.sendKeys("9");
			Thread.sleep(100);

			weight = driver.findElement(By.xpath("//input[@name='insured_members[self][weight]']"));
			weight.clear();
			weight.sendKeys("70");		
			Thread.sleep(100);
		}
		
		if(Spouse_DOB != "0")
		{
			// Spouse Details
				first_name = driver.findElement(By.xpath("//input[@name='insured_members[spouse][first_name]']"));
				first_name.clear();
				first_name.sendKeys("Spouse");
				Thread.sleep(100);

				last_name = driver.findElement(By.xpath("//input[@name='insured_members[spouse][last_name]']"));
				last_name.clear();
				last_name.sendKeys("last name");
				Thread.sleep(100);

				Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[spouse][insured_dob]']"));
				Member_dob.clear();
				Member_dob.sendKeys(Spouse_DOB);
				Thread.sleep(100);

				height_feet = driver.findElement(By.xpath("//input[@name='insured_members[spouse][height_feet]']"));
				height_feet.clear();
				height_feet.sendKeys("5");		
				Thread.sleep(100);

				height_inches = driver.findElement(By.xpath("//input[@name='insured_members[spouse][height_inches]']"));
				height_inches.sendKeys("9");
				Thread.sleep(100);

				weight = driver.findElement(By.xpath("//input[@name='insured_members[spouse][weight]']"));
				weight.clear();
				weight.sendKeys("70");
				Thread.sleep(100);
		}
	
		if(Son_DOB != "0")
		{
			// Son Details
			first_name = driver.findElement(By.xpath("//input[@name='insured_members[son][first_name]']"));
			first_name.clear();
			first_name.sendKeys("Son");
			Thread.sleep(100);

			last_name = driver.findElement(By.xpath("//input[@name='insured_members[son][last_name]']"));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[son][insured_dob]']"));
			Member_dob.clear();
			Member_dob.sendKeys(Son_DOB);
			Thread.sleep(100);

			height_feet = driver.findElement(By.xpath("//input[@name='insured_members[son][height_feet]']"));
			height_feet.clear();
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches = driver.findElement(By.xpath("//input[@name='insured_members[son][height_inches]']"));
			height_inches.sendKeys("0");
			Thread.sleep(100);

			weight = driver.findElement(By.xpath("//input[@name='insured_members[son][weight]']"));
			weight.clear();
			weight.sendKeys("40");
			Thread.sleep(100);
		}
		
		
	
		if(Daughter_DOB != "0")
		{
			// Daughter Details
			first_name = driver.findElement(By.xpath("//input[@name='insured_members[daughter][first_name]']"));
			first_name.clear();
			first_name.sendKeys("Daughter");
			

			Thread.sleep(100);

			last_name = driver.findElement(By.xpath("//input[@name='insured_members[daughter][last_name]']"));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[daughter][insured_dob]']"));
			Member_dob.clear();
			Member_dob.sendKeys(Daughter_DOB);
			Thread.sleep(100);

			height_feet = driver.findElement(By.xpath("//input[@name='insured_members[daughter][height_feet]']"));
			height_feet.clear();
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches = driver.findElement(By.xpath("//input[@name='insured_members[daughter][height_inches]']"));
			height_inches.sendKeys("0");
			Thread.sleep(100);

			weight = driver.findElement(By.xpath("//input[@name='insured_members[daughter][weight]']"));
			weight.clear();
			weight.sendKeys("40");
			Thread.sleep(100);
		}

			Thread.sleep(1000);
			//scroll down a page
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(500);
				
			WebElement Next_Button = driver.findElement(By.xpath("//button[@class='btn_comon green_btn createPolicySubmit insuredDetailsForm']"));
			Next_Button.click();
			
			Thread.sleep(1000);
	}

	@Test(priority = 11,dependsOnMethods = "Insured_Member_Detail_Page")
	public static void health_deatil() throws Exception 
	{
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='existingdisease existingdisease1'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='existingdisease existingdisease2'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='existingdisease existingdisease3'])[2]")).click();
						
        Thread.sleep(1000);

		//scroll down a page
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(500);
        // TnC checkbox
        WebElement TnC = driver.findElement(By.xpath("//div[@class='proposaltermscondition']/label/p"));
        TnC.click();
        
		//scroll down a page
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

        // driver.findElement(By.className("btn_comon close exp_propsal_btn"));
        // next button 
        WebElement btn_next = driver.findElement(By.xpath("//button[@class='btn_comon green_btn healthQuestionnaireForm']"));
		btn_next.click();
		
	}
	
	@Test(priority = 12, dependsOnMethods = "health_deatil")
	public static void Proposal_Summery() throws Exception 
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='premiumval']")));
		
		String Premium_Proposal_Summery = driver.findElement(By.xpath("//span[@id='premiumval']")).getText().toString();
		System.out.println("Premium Proposal Summery : " + Premium_Proposal_Summery);
	}

	
}
