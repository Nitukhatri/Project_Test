package Care_Supreme_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Insured_Member_Detail_Page {

	 static WebElement first_name, last_name, Member_dob, height_inches, weight, height_feet;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public Insured_Member_Detail_Page(WebDriver driver,String Self_DOB, String Spouse_DOB, String Son_DOB, String Son1_DOB, String Daughter_DOB, String Daughter1_DOB, String Father_DOB, String Mother_DOB, String Father_in_Law_DOB, String Mother_in_Law_DOB) throws Exception 
	{
		// TODO Auto-generated constructor stub
		Actions action = new Actions(driver);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
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
		
		System.out.println(Son1_DOB);
		
		if(Son1_DOB != "0")
		{
			// Son Details
			first_name = driver.findElement(By.xpath("//input[@name='insured_members[son1][first_name]']"));
			first_name.clear();
			first_name.sendKeys("Son_one");
			Thread.sleep(100);

			last_name = driver.findElement(By.xpath("//input[@name='insured_members[son1][last_name]']"));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[son1][insured_dob]']"));
			Member_dob.clear();
			Member_dob.sendKeys(Son_DOB);
			Thread.sleep(100);

			height_feet = driver.findElement(By.xpath("//input[@name='insured_members[son1][height_feet]']"));
			height_feet.clear();
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches = driver.findElement(By.xpath("//input[@name='insured_members[son1][height_inches]']"));
			height_inches.sendKeys("0");
			Thread.sleep(100);

			weight = driver.findElement(By.xpath("//input[@name='insured_members[son1][weight]']"));
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

		if(Daughter1_DOB != "0")
		{
			// Daughter Details
			first_name = driver.findElement(By.xpath("//input[@name='insured_members[daughter1][first_name]']"));
			first_name.clear();
			first_name.sendKeys("Daughter");
			

			Thread.sleep(100);

			last_name = driver.findElement(By.xpath("//input[@name='insured_members[daughter1][last_name]']"));
			last_name.clear();
			last_name.sendKeys("last name");
			Thread.sleep(100);

			Member_dob = driver.findElement(By.xpath("//input[@name='insured_members[daughter1][insured_dob]']"));
			Member_dob.clear();
			Member_dob.sendKeys(Daughter_DOB);
			Thread.sleep(100);

			height_feet = driver.findElement(By.xpath("//input[@name='insured_members[daughter1][height_feet]']"));
			height_feet.clear();
			height_feet.sendKeys("4");		
			Thread.sleep(100);

			height_inches = driver.findElement(By.xpath("//input[@name='insured_members[daughter1][height_inches]']"));
			height_inches.sendKeys("0");
			Thread.sleep(100);

			weight = driver.findElement(By.xpath("//input[@name='insured_members[daughter1][weight]']"));
			weight.clear();
			weight.sendKeys("40");
			Thread.sleep(100);
		}

		 if(Father_DOB != "0")
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
				Thread.sleep(100);
		}
		
		if(Mother_DOB != "0")
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
			Thread.sleep(100);
		}
	
		if(Father_in_Law_DOB != "0")
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
			Thread.sleep(100);
		}
		
		if(Mother_in_Law_DOB != "0")
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
	
}	// CLass END
