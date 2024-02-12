package Care_Advantage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Insured_Member_Detail_Page_advantage {

	 static WebElement first_name, last_name, Member_dob, height_inches, weight, height_feet;
	 static String name, first_name_xpath, last_name_xpath, Member_dob_xpath, height_inches_xpath, weight_xpath, height_feet_xpath;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public Insured_Member_Detail_Page_advantage(WebDriver driver,String Self_DOB, String Spouse_DOB, String Son_1_DOB, String Son_2_DOB,String Son_3_DOB, String Son_4_DOB, String Daughter_1_DOB, String Daughter_2_DOB, String Daughter_3_DOB, String Daughter_4_DOB, String Father_DOB, String Mother_DOB, String Father_in_Law_DOB, String Mother_in_Law_DOB) throws Exception 
	{
		// TODO Auto-generated constructor stub
		Actions action = new Actions(driver);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		if(Self_DOB != "0")
		{	
			
			name = driver.findElement(By.xpath("(//div//input[@value='SELF'])[2]")).getAttribute("name");		
	
			System.out.println(name);
			// Self Details
			first_name_xpath = name.replace("relation", "first_name");
			System.out.println(first_name_xpath);
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			Thread.sleep(200);
			first_name.sendKeys("Self");
			Thread.sleep(200);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			Thread.sleep(200);
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Thread.sleep(200);
			Member_dob.sendKeys(Self_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			Thread.sleep(200);
			height_feet.sendKeys("5");		
			Thread.sleep(500);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			Thread.sleep(200);
			height_inches.sendKeys("5");
			Thread.sleep(500);

			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			Thread.sleep(200);
			weight.sendKeys("70");		
			Thread.sleep(100);
		}
		
		if(Spouse_DOB != "0")
		{
					
			// Spouse Details
			name = driver.findElement(By.xpath("(//div//input[@value='SPSE'])[3]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			Thread.sleep(200);
			first_name.sendKeys("Spouse");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			Thread.sleep(200);
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Thread.sleep(200);
			Member_dob.sendKeys(Spouse_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			Thread.sleep(200);
			height_feet.sendKeys("5");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			Thread.sleep(200);
			height_inches.sendKeys("5");
			Thread.sleep(100);

			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.sendKeys("70");		
			Thread.sleep(100);

		}
	
		if(Son_1_DOB != "0")
		{
			// Son 1 Details
			name = driver.findElement(By.xpath("(//input[@value='SONM'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			Thread.sleep(200);
			first_name.sendKeys("Son");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			Thread.sleep(200);
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Thread.sleep(200);
			Member_dob.sendKeys(Son_1_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			Thread.sleep(200);
			weight.sendKeys("44");
			Thread.sleep(100);
		}
		
		System.out.println(Son_2_DOB);
		
		if(Son_2_DOB != "0")
		{
			// Son 2 Details
			name = driver.findElement(By.xpath("(//input[@value='SONM1'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			Thread.sleep(200);
			first_name.sendKeys("Son two");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			Thread.sleep(200);
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Thread.sleep(200);
			Member_dob.sendKeys(Son_2_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			Thread.sleep(200);
			weight.sendKeys("44");
			Thread.sleep(100);
			
		}

		if(!Son_3_DOB.contentEquals("0"))
		{
			// Son 3 Details
			name = driver.findElement(By.xpath("(//input[@value='SONM2'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			Thread.sleep(200);
			first_name.sendKeys("Son three");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			Thread.sleep(100);
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Thread.sleep(100);
			Member_dob.sendKeys(Son_3_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			Thread.sleep(100);
			weight.sendKeys("40");
			Thread.sleep(100);
			
		}		
		
		if(!Son_4_DOB.contentEquals("0"))
		{
			// Son 4 Details
			name = driver.findElement(By.xpath("(//input[@value='SONM3'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			Thread.sleep(100);
			first_name.sendKeys("Son four");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			Thread.sleep(100);
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Thread.sleep(100);
			Member_dob.sendKeys(Son_4_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			Thread.sleep(100);
			weight.sendKeys("40");
			Thread.sleep(100);
			
		}
		
		
		
		if(Daughter_1_DOB != "0")
		{
			// Daughter Details
			name = driver.findElement(By.xpath("(//input[@value='UDTR'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			Thread.sleep(100);
			first_name.sendKeys("Daughter");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			Thread.sleep(100);
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Thread.sleep(100);
			Member_dob.sendKeys(Daughter_1_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			Thread.sleep(100);
			weight.sendKeys("40");
			Thread.sleep(100);
			
		}

		if(Daughter_2_DOB != "0")
		{
			// Daughter 2 Details
			name = driver.findElement(By.xpath("(//input[@value='UDTR1'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			Thread.sleep(100);
			first_name.sendKeys("Daughter two");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			Thread.sleep(100);
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Thread.sleep(100);
			Member_dob.sendKeys(Daughter_2_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			Thread.sleep(100);
			weight.sendKeys("40");
			Thread.sleep(100);
			
		}

		if(!Daughter_3_DOB.contentEquals("0"))
		{
			// Daughter 3 Details
			name = driver.findElement(By.xpath("(//input[@value='UDTR2'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			Thread.sleep(100);
			first_name.sendKeys("Daughter three");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Member_dob.sendKeys(Daughter_3_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			weight.sendKeys("40");
			Thread.sleep(100);
			
		}

		if(!Daughter_4_DOB.contentEquals("0"))
		{
			// Daughter 4 Details
			name = driver.findElement(By.xpath("(//input[@value='UDTR3'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			first_name.sendKeys("Daughter four");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Member_dob.sendKeys(Daughter_4_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			weight.sendKeys("40");
			Thread.sleep(100);
			
		}

		
		if(!Father_DOB.contentEquals("0"))
		{
				// Father Details
			name = driver.findElement(By.xpath("(//input[@value='FATH'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			first_name.sendKeys("Father");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Member_dob.sendKeys(Father_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("5");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("5");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			weight.sendKeys("40");
			Thread.sleep(100);
			
		}
		
		if(!Mother_DOB.contentEquals("0"))
		{
			// Mother Details
			name = driver.findElement(By.xpath("(//input[@value='FATH'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			first_name.sendKeys("Mother");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Member_dob.sendKeys(Mother_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("5");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("5");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			weight.sendKeys("40");
			Thread.sleep(100);
			
		}
	
		if(!Father_in_Law_DOB.contentEquals("0"))
		{
			// Father_in_Law Details
			name = driver.findElement(By.xpath("(//input[@value='FLAW'])[2]")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			first_name.sendKeys("Father in law");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Member_dob.sendKeys(Father_in_Law_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_inches_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
			weight.clear();
			weight.sendKeys("40");
			Thread.sleep(100);
			
		}
		
		if(!Mother_in_Law_DOB.contentEquals("0"))
		{
			// Mother_in_Law Details
			name = driver.findElement(By.xpath("(//input[@value='MLAW'])")).getAttribute("name");		
			
			first_name_xpath = name.replace("relation", "first_name");
			first_name = driver.findElement(By.name(first_name_xpath));
			first_name.clear();
			first_name.sendKeys("Moyher in law");
			Thread.sleep(100);

			
			last_name_xpath = name.replace("relation", "last_name");
			last_name = driver.findElement(By.name(last_name_xpath));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob_xpath = name.replace("relation", "insured_dob");
			Member_dob = driver.findElement(By.name(Member_dob_xpath));
			Member_dob.clear();
			Member_dob.sendKeys(Mother_in_Law_DOB);
			Thread.sleep(100);

			
			height_feet_xpath = name.replace("relation", "height_feet");
			height_feet = driver.findElement(By.name(height_feet_xpath));
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches_xpath = name.replace("relation", "height_inches");
			height_inches = driver.findElement(By.name(height_feet_xpath));
			height_inches.sendKeys("0");
			Thread.sleep(100);
			
			weight_xpath = name.replace("relation", "weight");
			weight = driver.findElement(By.name(weight_xpath));
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

}
