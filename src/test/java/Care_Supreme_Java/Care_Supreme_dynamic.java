package Care_Supreme_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;
import java.util.Stack;

import javax.net.ssl.HttpsURLConnection;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.google.common.cache.Weigher;

import Care_Supreme.datademo;

public class Care_Supreme_dynamic {

	  static ChromeOptions co = new ChromeOptions();
	  static WebDriver driver = new ChromeDriver(co);

	  static Actions action = new Actions(driver);
		
	 static String mobile_number, Self, Spouse, Son, Son1, Daughter, Daughter1, Father, Mother, Father_in_Law, Mother_in_Law, Self_age, Spouse_age, 
	 Son_age, Son1_age, Daughter_age, Daughter1_age, Father_age, Mother_age, Father_in_Law_age, Mother_in_Law_age, Pincode, Care_Shield, Annual_Health_Check_up,
	 Instant_Cover, Reduction_in_PED_wait_in_Period, SI, Tenure, Communication_Pincode, Self_DOB, Spouse_DOB, Son_DOB, Son1_DOB, Daughter_DOB, Daughter1_DOB, 
	 Father_DOB, Mother_DOB, Father_in_Law_DOB, Mother_in_Law_DOB, Buy_now_Premium, Premium_Proposal_Summery, Premium_Edit_Quote, KYC_Verification_msg;

	 static WebElement last_name, Member_dob, height_inches, weight, height_feet, first_name;
	 
	 public static void Get_quote() throws Exception
		{
			if(mobile_number != "0")
			{
				WebElement Mobile_Number_Field = driver.findElement(By.id("mobile_no"));
				Mobile_Number_Field.sendKeys(mobile_number);
				Thread.sleep(100);
				WebElement Calculate_Premium_btn = driver.findElement(By.xpath("//button[@class='btn_custom quote_btn']"));
				Calculate_Premium_btn.click();
			}
			else
			{
				System.out.println("Mobile number is not given in Sheet");
			}
		}
	
	public static void Member_Selection_Section() throws Exception 
	{
		Thread.sleep(1000);
		
		if(Self != "0")
		{
			WebElement self = driver.findElement(By.xpath("//label[@for='self']"));
			self.click();
			Thread.sleep(1000);
		}
				
		if(Spouse != "0")
		{
			WebElement Spouse = driver.findElement(By.xpath("//label[@for='spouse']"));
			Spouse.click();
			Thread.sleep(1000);
		}
		
		if(Son != "0")
		{
			WebElement Son = driver.findElement(By.xpath("//label[@for='son']"));
			Son.click();
			Thread.sleep(1000);
		}
		
		if(Daughter != "0")
		{
			WebElement Daughter = driver.findElement(By.xpath("//label[@for='daughter']"));
			Daughter.click();
			Thread.sleep(1000);
		}
		
		 if(Father != "0")
		{
			WebElement Father = driver.findElement(By.xpath("//label[@for='father']"));
			Father.click();
			Thread.sleep(1000);
		}
		
		if(Mother != "0")
		{
			WebElement Mother = driver.findElement(By.xpath("//label[@for='mother']"));
			Mother.click();
			Thread.sleep(1000);
		}
		
		if(Father_in_Law != "0")
		{
			WebElement Father_in_Law = driver.findElement(By.xpath("//label[@for='father-in-law']"));
			Father_in_Law.click();
			Thread.sleep(1000);
		}
		
		if(Mother_in_Law != "0")
		{
			WebElement Mother_in_Law = driver.findElement(By.xpath("//label[@for='mother-in-law']"));
			Mother_in_Law.click();
			Thread.sleep(1000);
		}
		
		WebElement btn = driver.findElement(By.xpath("//a[@class='btn_custom step2_continue']"));
		btn.click();
	}
	
	public static void Member_Age_Selection_Section() throws Exception 
	{
		Thread.sleep(1000);
		if(Self_age != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='self']"))).selectByValue(Self_age);
			Thread.sleep(1000);
		}
		
		if(Spouse_age != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='spouse']"))).selectByValue(Spouse_age);
			Thread.sleep(1000);
		}
		
		if(Son_age != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='son']"))).selectByValue(Son_age);
			Thread.sleep(1000);
		}
		
		if(Daughter_age != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='daughter']"))).selectByValue(Daughter_age);
			Thread.sleep(1000);
		}
		
		 if(Father_age != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='father']"))).selectByValue(Father_age);
			Thread.sleep(1000);
		}
		
		if(Mother_age != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='mother']"))).selectByValue(Mother_age);
			Thread.sleep(1000);
		}
		
		if(Father_in_Law_age != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='father-in-law']"))).selectByValue(Father_age);
			Thread.sleep(1000);
		}
		
		if(Mother_in_Law_age != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='mother-in-law']"))).selectByValue(Mother_in_Law_DOB);
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("//a[@class='btn_custom step3_continue']")).click();
		Thread.sleep(3000);
	}
	
	public static void Pincode_Section() throws Exception
	{
		Thread.sleep(1000);
		if(Pincode != "0")
		{
			WebElement city = driver.findElement(By.xpath("//input[@id='pincode_search']"));
			city.click();
			Thread.sleep(1000);
			city.sendKeys(Pincode);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[@class='btn_custom view_quote']")).click();
			Thread.sleep(1000);
			driver.manage().window().fullscreen();

		}
		
		else
		{
			System.out.println("Pin code is not given in the Sheet.");
		}
		
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
	}
	
	public static void Add_ons_section_in_button() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='addition_co_btn']")).click();
		Thread.sleep(1000);
		
		//Care Shield
		if(Care_Shield != "0")
		{
			driver.findElement(By.xpath("//input[@id='make_claimShield']")).click();
			Thread.sleep(1000);
		}
				
		//Annual Health Check up
		if(Annual_Health_Check_up != "0")
		{
			driver.findElement(By.xpath("//input[@id='make_checkplus']")).click();
			Thread.sleep(1000);
		}
				
		//Instant Cover
		if(Instant_Cover != "0")
		{
			driver.findElement(By.xpath("//input[@id='make_IC']")).click();
			Thread.sleep(1000);
		}
				
		//Reduction in PED wait in Period
		if(Reduction_in_PED_wait_in_Period != "0")
		{
			driver.findElement(By.xpath("//input[@id='make_RPWP']")).click();
			Thread.sleep(1000);
		}
			
		driver.findElement(By.xpath("(//button[@class='btn_comon orange_btn'])[7]")).click();
		Thread.sleep(1000);
	}
	
	public static void Add_ons_section_on_Screen() throws Exception
	{
		Thread.sleep(1000);
		//Care Shield
		if(Care_Shield != "0")
		{
			driver.findElement(By.xpath("//button[@id='CS_toInclude']")).click();
			Thread.sleep(1000);
		}
		
		//Annual Health Check up
		if(Annual_Health_Check_up != "0")
		{
			driver.findElement(By.xpath("//button[@id='AHC_toInclude']")).click();
			Thread.sleep(1000);
		}
		
		//Instant Cover
		if(Instant_Cover != "0")
		{
			driver.findElement(By.xpath("//button[@id='//button[@id='IC_toInclude']']")).click();
			Thread.sleep(1000);
		}
		
		//Reduction in PED wait in Period
		if(Reduction_in_PED_wait_in_Period != "0")
		{
			driver.findElement(By.xpath("//button[@id='RPWP_toInclude']")).click();
			Thread.sleep(1000);
		}
	}
	
	public static void Sum_Insured_Selection() throws Exception
	{
		Thread.sleep(1000);
		if(SI.contentEquals("7"))
		{
			driver.findElement(By.xpath("//div//span[text()='7 L']")).click();
			Thread.sleep(5000);
		}
		
		if(SI.contentEquals("10"))
		{
			driver.findElement(By.xpath("//div//span[text()='10 L']")).click();
			Thread.sleep(5000);
		}
		
		if(SI.contentEquals("15"))
		{
			driver.findElement(By.xpath("//div//span[text()='15 L']")).click();
			Thread.sleep(5000);
		}
	}
	
	public static void Tenure_Selection() throws Exception 
	{
		Thread.sleep(1000);
		if(Tenure.contentEquals("1"))
		{
			driver.findElement(By.xpath("//label[@for='p_tenure1']")).click();
			Thread.sleep(5000);
		}
		
		if(Tenure.contentEquals("2"))
		{
			driver.findElement(By.xpath("//label[@for='p_tenure2']")).click();
			Thread.sleep(5000);
		}
		
		if(Tenure.contentEquals("3"))
		{
			driver.findElement(By.xpath("//label[@for='p_tenure3']")).click();
			Thread.sleep(5000);
		}
	}
	
	public static void Buy_Now_Premium() throws Exception 
	{
		Thread.sleep(1000);
		Buy_now_Premium = driver.findElement(By.xpath("//span[@class='total_premium prem_amount care_premium premium_post_discount']")).getText();
		System.out.println("Buy Now page Premium = " + Buy_now_Premium);
		Thread.sleep(1000);
	}
	
	public static void Buy_Now_Button() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='buy_for_btn']")).click();
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
	}
	
	public static void Confirm_proposal_page() throws Exception 
	{
		
		Thread.sleep(1000);
		Premium_Edit_Quote = driver.findElement(By.xpath("//span[@class='premium_total total_premium_top']")).getText();
		System.out.println("Premium on Edit Quote :  " + Premium_Edit_Quote);
		Thread.sleep(500);
		
		WebElement standardpaybtn = driver.findElement(By.xpath("//div/a[@class='link_brown']"));
		Thread.sleep(2000);
		standardpaybtn.click();
		Thread.sleep(1000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
	
	}
	
	public static void KYC_Verification() throws Exception 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='kyc_pan']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='pan_no']")).sendKeys("DUUPG3251C");
		Thread.sleep(1000);

		WebElement KYCDOB = driver.findElement(By.xpath("//div//input[@id='pan_dob']"));

		KYCDOB.sendKeys("04");
		KYCDOB.sendKeys("01");
		KYCDOB.sendKeys("2001");

		do
		{
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div//button[@class='verify_btn'])[1]")).click();

			Thread.sleep(10000);
	
			KYC_Verification_msg = driver.findElement(By.xpath("//div[@id='pan_verify']")).getText();
			
		}while(!KYC_Verification_msg.contentEquals("Verification Successful!"));

	}
	
	public static void Proposal_detail_page() throws Exception
	{
		KYC_Verification();
		
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
		
	/*	WebElement address_line1 = driver.findElement(By.xpath("//div/input[@id='addressLine1']"));
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
		Thread.sleep(100);
		*/

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

		
		List<WebElement> Nominee_select = driver.findElements(By.xpath("(//ul[@class='custom_drop_cont'])[9]/li"));
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
	
	public static void Insured_Member_Page() throws Exception 
	{
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		if(Self != "0")
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
		}
		
		if(Spouse != "0")
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
		}
		
		if(Son != "0")
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
		}
		
		if(Daughter != "0")
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
		}
		
		 if(Father != "0")
		{
				// Father Details
				first_name = driver.findElement(By.xpath("//input[@name='insured_members[father][first_name]']"));
				first_name.clear();
				first_name.sendKeys("Father");
				Thread.sleep(100);

				last_name = driver.findElement(By.xpath("//input[@name='insured_members[father][last_name]']"));
				last_name.clear();
				last_name.sendKeys("last name");
				Thread.sleep(100);

				Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[father][insured_dob]']"));
				Member_dob.clear();
				Member_dob.sendKeys(Father_DOB);
				Thread.sleep(100);

				height_feet = driver.findElement(By.xpath("//input[@name='insured_members[father][height_feet]']"));
				height_feet.clear();
				height_feet.sendKeys("5");		
				Thread.sleep(100);

				height_inches = driver.findElement(By.xpath("//input[@name='insured_members[father][height_inches]']"));
				height_inches.sendKeys("9");
				Thread.sleep(100);

				weight = driver.findElement(By.xpath("//input[@name='insured_members[father][weight]']"));
				weight.clear();
				weight.sendKeys("70");
		}
		
		if(Mother != "0")
		{
			// Mother Details
			first_name = driver.findElement(By.xpath("//input[@name='insured_members[mother][first_name]']"));
			first_name.clear();
			first_name.sendKeys("Mother");
			Thread.sleep(100);

			last_name = driver.findElement(By.xpath("//input[@name='insured_members[mother][last_name]']"));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[mother][insured_dob]']"));
			Member_dob.clear();
			Member_dob.sendKeys(Mother_DOB);
			Thread.sleep(100);

			height_feet = driver.findElement(By.xpath("//input[@name='insured_members[mother][height_feet]']"));
			height_feet.clear();
			height_feet.sendKeys("5");		
			Thread.sleep(100);

			height_inches = driver.findElement(By.xpath("//input[@name='insured_members[mother][height_inches]']"));
			height_inches.sendKeys("9");
			Thread.sleep(100);

			weight = driver.findElement(By.xpath("//input[@name='insured_members[mother][weight]']"));
			weight.clear();
			weight.sendKeys("70");
		}
	
		if(Father_in_Law != "0")
		{
			// Father_in_Law Details
			first_name = driver.findElement(By.xpath("//input[@name='insured_members[father-in-law][first_name]']"));
			first_name.clear();
			first_name.sendKeys("Father-in-law");
			Thread.sleep(100);

			last_name = driver.findElement(By.xpath("//input[@name='insured_members[father-in-law][last_name]']"));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[father-in-law][insured_dob]']"));
			Member_dob.clear();
			Member_dob.sendKeys(Father_in_Law_DOB);
			Thread.sleep(100);

			height_feet = driver.findElement(By.xpath("//input[@name='insured_members[father-in-law][height_feet]']"));
			height_feet.clear();
			height_feet.sendKeys("5");		
			Thread.sleep(100);

			height_inches = driver.findElement(By.xpath("//input[@name='insured_members[father-in-law][height_inches]']"));
			height_inches.sendKeys("9");
			Thread.sleep(100);

			weight = driver.findElement(By.xpath("//input[@name='insured_members[father-in-law][weight]']"));
			weight.clear();
			weight.sendKeys("70");
		}
		
		if(Mother_in_Law != "0")
		{
			// Mother_in_Law Details
			first_name = driver.findElement(By.xpath("//input[@name='insured_members[mother-in-law][first_name]']"));
			first_name.clear();
			first_name.sendKeys("Mother_in_Law");
			Thread.sleep(100);

			last_name = driver.findElement(By.xpath("//input[@name='insured_members[mother-in-law][last_name]']"));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[mother-in-law][insured_dob]']"));
			Member_dob.clear();
			Member_dob.sendKeys(Mother_in_Law_DOB);
			Thread.sleep(100);

			height_feet = driver.findElement(By.xpath("//input[@name='insured_members[mother-in-law][height_feet]']"));
			height_feet.clear();
			height_feet.sendKeys("5");		
			Thread.sleep(100);

			height_inches = driver.findElement(By.xpath("//input[@name='insured_members[mother-in-law][height_inches]']"));
			height_inches.sendKeys("9");
			Thread.sleep(100);

			weight = driver.findElement(By.xpath("//input[@name='insured_members[mother-in-law][weight]']"));
			weight.clear();
			weight.sendKeys("70");
		}

			Thread.sleep(1000);
			//scroll down a page
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(500);
				
			WebElement Next_Button = driver.findElement(By.xpath("//button[@class='btn_comon green_btn createPolicySubmit insuredDetailsForm']"));
			Next_Button.click();
			
			Thread.sleep(1000);
		}
		
	public static void Health_Deatil_Pge() throws Exception 
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
		
		Thread.sleep(10000);
		
	}
	
	public static void Proposal_Summery() throws Exception 
	{
		Thread.sleep(1000);
		
		Premium_Proposal_Summery = driver.findElement(By.xpath("//span[@id='premiumval']")).getText();
		System.out.println("Premium Proposal Summery : " + Premium_Proposal_Summery);
	}

	/*
	 * public static void Premium_Calculation() { Premium_Proposal_Summery }
	 */
	
	 // Main method
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Set the path to the ChromeDriver executable
	    System.setProperty("wedriver.chrome.driver", "../Selenium_test_project/chromedriver.exe");
	    
	    //	co.addArguments("--remote-allow-origins=*");
	    
	    co.addArguments("--incognito");
	    
	    DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(ChromeOptions.CAPABILITY, co);
	    co.merge(cap);
  
	    	FileInputStream lead_data = new FileInputStream("C:\\nitu2\\eclipse-workspace\\Maven_test\\files\\Care Supreme test data.xlsx");

			Workbook workbook = WorkbookFactory.create(lead_data);
			Sheet sheet = workbook.getSheetAt(0);

			String header[] = new String[sheet.getRow(0).getLastCellNum()];
			String ar[] = new String[sheet.getRow(0).getLastCellNum()];
			
			// Loop for ROW
			for(int rowNumber = 1; rowNumber < sheet.getLastRowNum(); rowNumber++) {
			    Row row = sheet.getRow(rowNumber);

			    // Navigate to the webpage where the mobile number field is present
		        driver.get("https://www.careinsurance.com/product/care-supreme");
		        driver.manage().window().fullscreen();
		     //   driver.manage().deleteAllCookies();
		      			    
			    
			    // Loop for COLUMN
			    for(int columnNumber = 0; columnNumber <  row.getLastCellNum(); columnNumber++) {
			        Cell cell = row.getCell(columnNumber);
			        
			        if(cell != null) 
			        {
			        	
			        	if(rowNumber==0) 
			        	{
			        		header[columnNumber]=cell.toString();
			        	}
			        	else
			        	{
			        		ar[columnNumber]=  NumberToTextConverter.toText(cell.getNumericCellValue());	
			        	}
			        } 
			        
			    }	// COLUMN LOOP END
			    
			    	// Assigning values from array

			    	mobile_number = ar[0];
			    	Self = ar[1];
			    	Spouse = ar[2];
			    	Son = ar[3];
			    	Son1 = ar[4];
			    	Daughter = ar[5];
			    	Daughter1 = ar[6];
			    	Father = ar[7];
			    	Mother = ar[8];
			    	Father_in_Law = ar[9];
			    	Mother_in_Law = ar[10];
			    	Self_age = ar[11];
			    	Spouse_age = ar[12];
			    	Son_age = ar[13];
			    	Son1_age = ar[14];
			    	Daughter_age = ar[15];
			    	Daughter1_age = ar[16];
			    	Father_age = ar[17];
			    	Mother_age = ar[18];
			    	Father_in_Law_age = ar[19];
			    	Mother_in_Law_age = ar[20];
			    	Pincode = ar[21];
			    	Care_Shield = ar[22];
			    	
			    	Annual_Health_Check_up = ar[23];    	
			    	Instant_Cover = ar[24];
			    	Reduction_in_PED_wait_in_Period = ar[25];
			    	SI = ar[26];
			    	Tenure = ar[27];
			    	Communication_Pincode = ar[28];
			    	Self_DOB = ar[29];
			    	Spouse_DOB = ar[30];
			    	Son_DOB = ar[31];
			    	Son1_DOB = ar[32];
			    	Daughter_DOB = ar[33];
			    	Daughter1_DOB = ar[34];
			    	Father_DOB = ar[35];
			    	Mother_DOB = ar[36];
			    	Father_in_Law_DOB = ar[37];
			    	Mother_in_Law_DOB = ar[38];
			    

					
					System.out.println(" "+ mobile_number+" " +Self+" " + Spouse+" " + Son+" "+ Son1 +" " + Daughter+" "+ Daughter1 +" " + Father+" " + Mother+" " + Father_in_Law+" "+Mother_in_Law+" " + Self_age+" " + Spouse_age+" " + Son_age+" "+Son1_age+" " + Daughter_age+" "+Daughter1_age+" " + Father_age+" " +
					 Mother_age+" " + Father_in_Law_age+" " + Mother_in_Law_age+" " + Pincode+" " + Care_Shield+" " + Annual_Health_Check_up+" " + Instant_Cover+" " + Reduction_in_PED_wait_in_Period+" " + SI+" " + Tenure+" " +
					 Communication_Pincode+" " + Self_DOB+" " + Spouse_DOB+" " + Son_DOB+" " +Son1_DOB+" "+ Daughter_DOB+" "+Daughter1_DOB+" " + Father_DOB+" " + Mother_DOB+" " + Father_in_Law_DOB+" " + Mother_in_Law_DOB);
			       
					
					//	Get_quote();
						new Get_Quote_Section(driver, mobile_number);
						new Supreme_Member_Selection(driver, Self, Spouse, Son, Son1, Daughter, Daughter1, Father, Mother, Father_in_Law, Mother_in_Law);
						new Supreme_members_age_section(driver, Self_age, Spouse_age, Son_age, Son1_age, Daughter_age, Daughter1_age, Father_age, Mother_age, Father_in_Law_age, Mother_in_Law_age);
						new Pincode_Supreme(driver, Pincode);
						
						//  Member_Selection_Section();
				      //  Member_Age_Selection_Section();
				      //  Pincode_Section();
				  //    Add_ons_section_in_button();
				        Tenure_Selection();
				        Sum_Insured_Selection();
				        Buy_Now_Premium();
				        Buy_Now_Button();
				        

				        
				        Confirm_proposal_page();
				        
				        Proposal_detail_page();
				        //Insured_Member_Page();
						new Insured_Member_Detail_Page(driver, Self_DOB, Spouse_DOB, Son_DOB, Son1_DOB, Daughter_DOB, Daughter1_DOB, Father_DOB, Mother_DOB, Father_in_Law_DOB, Mother_in_Law_DOB);
				        Health_Deatil_Pge();
						Proposal_Summery();
						//  Proposal_detail_page();
						    
				        System.out.println("DONE......");
				        
				        Thread.sleep(2000);
				       // driver.close();
				
	       		}// ROW LOOP END		
	}	// MAIN END	
}	// CLASS END
