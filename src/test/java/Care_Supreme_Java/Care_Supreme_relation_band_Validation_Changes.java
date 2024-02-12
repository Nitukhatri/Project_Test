package Care_Supreme_Java;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Care_Supreme_relation_band_Validation_Changes {

	static ChromeOptions co = new ChromeOptions();
	static WebDriver driver = new ChromeDriver(co);
	static Actions action = new Actions(driver);

	static String Error_msg;
	static WebElement Self, Spouse, Son, Daughter, Father, Mother, Father_in_Law, Mother_in_Law, Button, Done_Button,
			Add_member, Error_msg_element, Son1_add, Son1_minus, Daughter1_add, Daughter1_minus, Self_dropdown,
			Spouse_dropdown, Son_dropdown, Son1_dropdown, Daughter_dropdown, Daughter1_dropdown, Father_dropdown,
			Mother_dropdown, Father_in_Law_dropdown, Mother_in_Law_dropdown;

	static List<WebElement> Self_dropdown_list, Spouse_dropdown_list, Son_dropdown_list, Son1_dropdown_list, Daughter_dropdown_list, Daughter1_dropdown_list, Father_dropdown_list, Mother_dropdown_list, Father_in_Law_dropdown_list, Mother_in_Law_dropdown_list;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Set the path to the ChromeDriver executable
		System.setProperty("wedriver.chrome.driver", "../Selenium_test_project/chromedriver.exe");

		// co.addArguments("--remote-allow-origins=*");

		co.addArguments("--incognito");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, co);
		co.merge(cap);

		// Navigate to the webpage where the mobile number field is present
	//	driver.get("https://www.careinsurance.com/product/care-supreme");
		
		driver.get("https://careuat.careinsurance.com/v1/product/care-supreme");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

		new Get_Quote_Section(driver, "9876545670");
		Actions sction = new Actions(driver);

		// Member_Selection_Section();

		Thread.sleep(3000);
		// action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("r").keyUp(Keys.SHIFT).perform();

//			driver.get("https://careuat.careinsurance.com/product/care-supreme");
//		    driver.manage().window().fullscreen();

		
		Member_Selection_Section();
		
		
		new Supreme_Member_Selection(driver, "1", "0", "0", "0", "0", "0", "0", "0", "0", "0");
		new Supreme_members_age_section(driver, "25", "0", "0", "0", "0", "0", "0", "0", "0", "0");
		new Pincode_Supreme(driver, "124001");
		
		Buy_Now_Page_Member_Selection();
		
		System.out.println("Select member for futher journey....................");
		Thread.sleep(30000);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='buy_for_btn']")).click();
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(By.id("edit_quote")).click();
		Thread.sleep(1000);
		Edit_Quote_Member_Selection();		
		
		// Test_Case3();

	} // Main END

	public static void Member_Selection_Section() throws Exception {

		Self = driver.findElement(By.xpath("//label[@for='self']"));
		Spouse = driver.findElement(By.xpath("//label[@for='spouse']"));
		Son = driver.findElement(By.xpath("//label[@for='son']"));
		Daughter = driver.findElement(By.xpath("//label[@for='daughter']"));
		Father = driver.findElement(By.xpath("//label[@for='father']"));
		Mother = driver.findElement(By.xpath("//label[@for='mother']"));
		Father_in_Law = driver.findElement(By.xpath("//label[@for='father-in-law']"));
		Mother_in_Law = driver.findElement(By.xpath("//label[@for='mother-in-law']"));

//		Button = driver.findElement(By.xpath("//a[@class='btn_custom step2_continue']"));
		
		Button = driver.findElement(By.xpath("//a[@class='btn_custom step2_continue custum_common_btn']"));
		Error_msg_element = driver.findElement(By.xpath("//div//p[@class='error_msg']"));
		Thread.sleep(1000);

		Test_Case1(Self, Spouse, Son, Daughter, Father, Mother, Father_in_Law, Mother_in_Law, Button);
		Test_Case2(Self, Spouse, Son, Daughter, Father, Mother, Father_in_Law, Mother_in_Law, Button);
		System.out.println("Pass : Test Case 1 \nPass : Test Case 2");

	}

	public static void Test_Case1(WebElement Self, WebElement Spouse, WebElement Son, WebElement Daughter,
			WebElement Father, WebElement Mother, WebElement Father_in_Law, WebElement Mother_in_Law, WebElement Button)
			throws Exception {
		Thread.sleep(500);
		// Self already selected no need to select
		Spouse.click();
		Thread.sleep(500);

		Button.click();
		System.out.println("Self, Spouse Pass...");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='step3 Cr-PreQuote-InsuredAge']/p/img")).click();
		Thread.sleep(1000);

		Self.click();
		Thread.sleep(500);
		Spouse.click();
		Thread.sleep(500);

		Father.click();
		Thread.sleep(500);
		Mother.click();
		Thread.sleep(500);

		Button.click();
		System.out.println("Father, Mother Pass...");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='step3 Cr-PreQuote-InsuredAge']/p/img")).click();
		Thread.sleep(1000);

		Father.click();
		Thread.sleep(500);
		Mother.click();
		Thread.sleep(500);

		Father_in_Law.click();
		Thread.sleep(500);
		Mother_in_Law.click();
		Thread.sleep(500);

		Button.click();
		System.out.println("Father in Law, Mother in Law Pass...");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='step3 Cr-PreQuote-InsuredAge']/p/img")).click();
		Thread.sleep(1000);

		Father_in_Law.click();
		Thread.sleep(500);
		Mother_in_Law.click();
		Thread.sleep(500);
	}

	public static void Test_Case2(WebElement Self, WebElement Spouse, WebElement Son, WebElement Daughter,
			WebElement Father, WebElement Mother, WebElement Father_in_Law, WebElement Mother_in_Law, WebElement Button)
			throws Exception {
		// no member selected
		Button.click();
		Error_msg = Error_msg_element.getText();
		if (Error_msg.contentEquals("Please select atleast one member")) {
			System.out.println("Please select atleast one member.");
		}

		Thread.sleep(1000);

		Self.click();
		Thread.sleep(500);
		Father.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		// Relationship combination not allowed

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Self, Father Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Self, Father Relationship  combination allowed.");
		}

		Father.click();
		Thread.sleep(500);

		Mother.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Self, Mother Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Self, Mother Relationship  combination allowed.");
		}

		Mother.click();
		Thread.sleep(500);

		Father_in_Law.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Self, Father in Law Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Self, Father in Law Relationship  combination  allowed.");
		}

		Father_in_Law.click();
		Thread.sleep(500);

		Mother_in_Law.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Self, Mother in Law Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Self, Mother in Law Relationship  combination  allowed.");
		}

		Mother_in_Law.click();
		Thread.sleep(500);

		Self.click();
		Thread.sleep(500);

		System.out
				.println("Spouse with father, mother, father in law, mother in law not allowed : Cases are Verified ");

		// Spouse combination not allowed

		Spouse.click();
		Thread.sleep(500);
		Father.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Spouse, Father Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Spouse, Father Relationship  combination  allowed.");
		}

		Father.click();
		Thread.sleep(500);

		Mother.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Spoue, Mother Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Spoue, Mother Relationship  combination  allowed.");
		}

		Mother.click();
		Thread.sleep(500);

		Father_in_Law.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Spoue, Father in Law Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Spoue, Father in Law Relationship  combination  allowed.");
		}

		Father_in_Law.click();
		Thread.sleep(500);

		Mother_in_Law.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Spouse, Mother in Law Relationship  combination  not allowed.");
		}

		Mother_in_Law.click();
		Thread.sleep(500);

		Spouse.click();
		Thread.sleep(500);

		System.out
				.println("Spouse with father, mother, father in law, mother in law not allowed : Cases are Verified.");

		// Father comibination not aloowed

		Father.click();
		Thread.sleep(500);

		Father_in_Law.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Father, Father in Law Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Spouse, Mother in Law Relationship  combination  allowed.");
		}

		Father_in_Law.click();
		Thread.sleep(500);

		Mother_in_Law.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Father, Mother in Law Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Father, Mother in Law Relationship  combination  allowed.");
		}

		Mother_in_Law.click();
		Thread.sleep(500);

		Father.click();
		Thread.sleep(500);

		System.out.println("Father with father in law, mother in law not allowed ");

		// Mother combination not allowed

		Mother.click();
		Thread.sleep(500);

		Father_in_Law.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Mother, Father in Law Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Mother, Father in Law Relationship  combination  allowed.");
		}

		Father_in_Law.click();
		Thread.sleep(500);

		Mother_in_Law.click();
		Thread.sleep(500);

		Button.click();
		Thread.sleep(1000);

		Error_msg = driver.findElement(By.xpath("//div//p[@class='error_msg']")).getText();
		if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
			System.out.println("Mother, Mother in Law Relationship  combination  not allowed.");
		} else {
			System.out.println("BUG : Mother, Mother in Law Relationship  combination  allowed.");
		}

		Mother_in_Law.click();
		Thread.sleep(500);

		Mother.click();
		Thread.sleep(500);

		System.out
				.println("Mother with father, mother, father in law, mother in law not allowed : Cases are Verified.");

	//	Self.click();
	//	Thread.sleep(500);
	//	Button.click();
	}

	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	static List<WebElement> Element_list;

	public static void Test_Case3() throws Exception {
		Error_msg_element = driver.findElement(By.xpath("//div//span[@class='error-age panel_cont_inner']"));

		Thread.sleep(1000);

		// Self selected default

		/*
		 * Self.click(); Thread.sleep(500); Done_Button.click(); Thread.sleep(500);
		 * 
		 * Error_msg = Error_msg_element.getText(); if(Error_msg !=
		 * "Please select a member") { System.out.
		 * println("No Memeber is selected and validation is not coming : Please select a member"
		 * ); }
		 * 
		 * Add_member.click(); Thread.sleep(500);
		 * 
		 * Self.click(); Thread.sleep(500);
		 */

		// WebDriverWait wait = new WebDriverWait (driver, 15);
		// Title of the webpage is "Software Testing Material - A site for Software
		// Testers"
		wait.until(ExpectedConditions.elementToBeClickable(Spouse));

		Spouse.click();
		// Thread.sleep(500);

		wait.until(ExpectedConditions.elementToBeClickable(Done_Button)).click();
//		Done_Button.click();
		Thread.sleep(500);

		Self_dropdown = driver.findElement(
				By.xpath("//div[@class='form_input borderdinput age_input selfage selfage selected adult']//div"));
		wait.until(ExpectedConditions.elementToBeClickable(Self_dropdown));
		Self_dropdown.click();
		Thread.sleep(1000);

		Element_list = driver.findElements(By
				.xpath("//div[@class='form_input borderdinput age_input selfage selfage selected adult in']//ul//li"));

		Thread.sleep(1000);

		for (WebElement e : Element_list) {
			if (e.getText().toString().contentEquals("20 Yr.")) {
				e.click();
				break;
			}
		}

		Thread.sleep(3000);

		Spouse_dropdown = driver
				.findElement(By.xpath("//div[@class='form_input borderdinput age_input adult spouse1age']//div"));
		Spouse_dropdown.click();
		Thread.sleep(1000);

		Element_list = driver.findElements(
				By.xpath("//div[@class='form_input borderdinput age_input adult spouse1age in']//ul//li"));
		Thread.sleep(1000);

		for (WebElement e : Element_list) {
			if (e.getText().toString().contentEquals("29 Yr.")) {
				e.click();
				break;
			}
		}

		Thread.sleep(3000);

		System.out.println("Self, Spouse Pass...");

		Add_member.click();
		Thread.sleep(1000);

		Self.click();
		Thread.sleep(2000);
		Spouse.click();
		Thread.sleep(2000);

		Father.click();
		Thread.sleep(1000);
		Mother.click();
		Thread.sleep(1000);

		Done_Button.click();
		Thread.sleep(1000);

		Error_msg = Error_msg_element.getText();
		if (Error_msg.contentEquals("Please select a member")) {
			Father_dropdown = driver.findElement(
					By.xpath("//div[@class='form_input borderdinput age_input   adult father1age ']//div"));
			Father_dropdown.click();
			Thread.sleep(1000);

			Element_list = driver.findElements(
					By.xpath("//div[@class='form_input borderdinput age_input adult father1age in']//ul//li"));
			Thread.sleep(1000);

			for (WebElement e : Element_list) {
				if (e.getText().toString().contentEquals("20 Yr.")) {
					e.click();
					break;
				}
			}

			Thread.sleep(3000);

			Mother_dropdown = driver
					.findElement(By.xpath("//div[@class='form_input borderdinput age_input adult mother1age']//div"));
			Mother_dropdown.click();
			Thread.sleep(1000);

			Element_list = driver.findElements(
					By.xpath("//div[@class='form_input borderdinput age_input adult mother1age in']//ul//li"));
			Thread.sleep(1000);

			for (WebElement e : Element_list) {
				if (e.getText().toString().contentEquals("20 Yr.")) {
					e.click();
					break;
				}
			}

			Thread.sleep(3000);

			System.out.println("Father, Mother Pass...");
		} else {
			System.out.println("Please select a member Validation is not coming.");
		}

		Add_member.click();
		Thread.sleep(1000);

		Father.click();
		Thread.sleep(2000);
		Mother.click();
		Thread.sleep(2000);

		Father_in_Law.click();
		Thread.sleep(1000);
		Mother_in_Law.click();
		Thread.sleep(1000);

		Done_Button.click();
		Thread.sleep(1000);

		Error_msg = Error_msg_element.getText();
		if (Error_msg.contentEquals("Please select a member")) {
			Father_in_Law_dropdown = driver.findElement(
					By.xpath("//div[@class='form_input borderdinput age_input   adult father-in-law1age ']//div"));
			Father_in_Law_dropdown.click();
			Thread.sleep(1000);

			Element_list = driver.findElements(
					By.xpath("//div[@class='form_input borderdinput age_input adult father-in-law1age in']//ul//li"));
			Thread.sleep(1000);

			for (WebElement e : Element_list) {

				if (e.getText().toString().contentEquals("80 Yr.")) {
					e.click();
					break;
				}
			}

			Thread.sleep(3000);

			Mother_in_Law_dropdown = driver.findElement(
					By.xpath("//div[@class='form_input borderdinput age_input adult mother-in-law1age']//div"));
			Mother_in_Law_dropdown.click();
			Thread.sleep(1000);

			Element_list = driver.findElements(
					By.xpath("//div[@class='form_input borderdinput age_input adult mother-in-law1age in']//ul//li"));
			Thread.sleep(1000);

			for (WebElement e : Element_list) {
				if (e.getText().toString().contentEquals("70 Yr.")) {
					e.click();
					break;
				}
			}

			Thread.sleep(3000);

			System.out.println("Father in law, Mother in law Pass...");
		} else {
			System.out.println("Please select a member Validation is not coming.");
		}

		Add_member.click();
		Thread.sleep(1000);

		Father_in_Law.click();
		Thread.sleep(2000);
		Mother_in_Law.click();
		Thread.sleep(2000);

	}

	public static void Test_Case4() throws Exception {
		Error_msg_element = driver.findElement(By.xpath("//div//span[@class='error-age panel_cont_inner']"));

		Thread.sleep(1000);

		// Self with not allowed combinationss
		Self.click();
		Thread.sleep(1000);
		Father.click();
		Thread.sleep(1000);

		Done_Button.click();
		Thread.sleep(1000);

		Error_msg = Error_msg_element.getText();
		if (Error_msg.contentEquals("Please select a member")) {
			Self_dropdown.click();
			Thread.sleep(1000);

			Element_list = driver.findElements(By.xpath(
					"//div[@class='form_input borderdinput age_input selfage selfage selected adult in']//ul//li"));
			Thread.sleep(1000);

			for (WebElement e : Element_list) {
				if (e.getText().toString().contentEquals("20 Yr.")) {
					e.click();
					break;
				}
			}

			Thread.sleep(3000);

			Father_dropdown.click();
			Thread.sleep(1000);

			Element_list = driver.findElements(
					By.xpath("//div[@class='form_input borderdinput age_input adult father1age in']//ul//li"));
			Thread.sleep(1000);

			for (WebElement e : Element_list) {
				System.out.println(e);
				if (e.getText().toString().contentEquals("80 Yr.")) {
					e.click();
					break;
				}
			}

			Thread.sleep(3000);

			Error_msg = Error_msg_element.getText();
			if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
				System.out.println("Self, Father Relationship  combination  not allowed.");
			} else {
				System.out.println("BUG : Self, Father Relationship  combination allowed.");
			}
		} else {
			System.out.println("Please select a member Validation is not coming.");
		}

		Add_member.click();
		Thread.sleep(1000);

		Father.click();
		Thread.sleep(2000);
		Mother.click();
		Thread.sleep(1000);

		Done_Button.click();
		Thread.sleep(1000);

		Error_msg = Error_msg_element.getText();
		if (Error_msg.contentEquals("Please select a member")) {

			Error_msg = Error_msg_element.getText();
			if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
				System.out.println("Self, Mother Relationship  combination  not allowed.");
			} else {
				System.out.println("BUG : Self, Mother Relationship  combination allowed.");
			}
		} else {
			System.out.println("Please select a member Validation is not coming.");
		}

		Add_member.click();
		Thread.sleep(1000);

		Mother.click();
		Thread.sleep(1000);

		Father_in_Law.click();
		Thread.sleep(1000);

		Done_Button.click();
		Thread.sleep(1000);

		Error_msg = Error_msg_element.getText();
		if (Error_msg.contentEquals("Please select a member")) {

			Error_msg = Error_msg_element.getText();
			if (Error_msg.contentEquals("Relationship  combination  not allowed")) {
				System.out.println("Self, Father in law Relationship  combination  not allowed.");
			} else {
				System.out.println("BUG : Self, Father in law Relationship  combination allowed.");
			}
		} else {
			System.out.println("Please select a member Validation is not coming.");
		}

		Add_member.click();
		Thread.sleep(1000);

	}
	
	
	public static void combination_verification(WebElement Member1, WebElement Member2) throws Exception 
	{
	
		List<WebElement> dropdown_list;
		Error_msg_element = driver.findElement(By.xpath("//div//span[@class='error-age panel_cont_inner']"));

		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(Add_member));

		Add_member.click();
		Thread.sleep(1000);

		Member1.click();
		String name1 = Member1.getText().toString();
		Thread.sleep(1000);
		
		Member2.click();
		String name2 = Member2.getText().toString();
		Thread.sleep(1000);

		Done_Button.click();
		Thread.sleep(1000);

			Error_msg = Error_msg_element.getText().toString();
			
			if (Error_msg.contentEquals("Please select a member")) 
				{
				
					driver.findElement(By.xpath("(//div[@class='age_dropdown custom_dropdown'])[1]")).click();
					Thread.sleep(1000);
					
						dropdown_list = driver.findElements(By.xpath(("(//div//ul[@class='custom_drop_cont'])[1]//li")));
					
						for (WebElement list : dropdown_list) 
						{
							if (list.getText().toString().contentEquals("30 Yr.")) 
							{
								list.click();
								break;
							}
						}

						Thread.sleep(2000);

						driver.findElement(By.xpath("(//div[@class='age_dropdown custom_dropdown'])[2]")).click();
						Thread.sleep(1000);
						
						dropdown_list = driver.findElements(By.xpath(("(//div//ul[@class='custom_drop_cont'])[2]//li")));
					
						for (WebElement list : dropdown_list) 
						{
							if (list.getText().toString().contentEquals("30 Yr.")) 
							{
								list.click();
								break;
							}
						}

						Thread.sleep(2000);	
						
						Error_msg = Error_msg_element.getText().toString();

				
						if (Error_msg.contentEquals("Relationship combination not allowed")) 
						{
							System.out.println("Invalid Combination - " + name1 +" : " + name2);
						}
						else 
						{
								System.out.println("Valid Combination - " + name1 +" : " + name2);	
						}
			
				}
				else 
				{
					System.out.println("Please select a member Validation is not coming.");
				}

			
		Add_member.click();
		Thread.sleep(1000);

		Member1.click();
		Thread.sleep(1000);
		Member2.click();
		Thread.sleep(1000);

		Done_Button.click();
		Thread.sleep(1000);

	}

	public static void Buy_Now_Page_Member_Selection() throws Exception 
	{
		
		
	//	Buy_Now_Member_Selection buy_now = new Buy_Now_Member_Selection();

	//	Object[] relation_array = buy_now.Buy_Now_add_Member_Selection(driver);

	//	Object[] relation_array = new Buy_Now_Member_Selection().Buy_Now_add_Member_Selection(driver);
		
	//	WebElement[] relation = (WebElement[]) relation_array[0];
	//	List<WebElement>[] relation_dropdown_list = (List<WebElement>[]) relation_array[1];
			
		WebElement relation[] = new Buy_Now_Member_Selection().Buy_Now_add_Member_Selection(driver);
		
		Self = relation[0];
		Spouse = relation[1];
		Son = relation[2];
		Son1_add = relation[3];
		Son1_minus = relation[4];
		Daughter = relation[5];
		Daughter1_add = relation[6];
		Daughter1_minus = relation[7];
		Father = relation[8];
		Mother = relation[9];
		Father_in_Law = relation[10];
		Mother_in_Law = relation[11];
		Done_Button = relation[12];
		Error_msg_element = relation[13];
		Add_member = relation[14];

/*		Self_dropdown = relation[15];
		Spouse_dropdown = relation[16];
		Son_dropdown = relation[17];
		Son1_dropdown = relation[18];
		Daughter_dropdown = relation[19];
		Daughter1_dropdown = relation[20];
		Father_dropdown = relation[21];
		Mother_dropdown = relation[22];
		Father_in_Law_dropdown = relation[23];
		Mother_in_Law_dropdown = relation[24];
		
		
		
		Self_dropdown_list = relation_dropdown_list[0];
		Spouse_dropdown_list = relation_dropdown_list[1];   
		Son_dropdown_list = relation_dropdown_list[2];
		Son1_dropdown_list = relation_dropdown_list[3];
		Daughter_dropdown_list = relation_dropdown_list[4];
		Daughter1_dropdown_list = relation_dropdown_list[5];
		Father_dropdown_list = relation_dropdown_list[6];
		Mother_dropdown_list = relation_dropdown_list[7];
		Father_in_Law_dropdown_list = relation_dropdown_list[8];
		Mother_in_Law_dropdown_list = relation_dropdown_list[9];
*/
		System.out.println("All Buy now drivers are initilised...");
		
		combination_verification(Self,Spouse);
		combination_verification(Self,Mother);
		combination_verification(Self,Father);
		combination_verification(Self,Mother);
		combination_verification(Self,Father_in_Law);
		combination_verification(Self,Mother_in_Law);
		combination_verification(Spouse,Mother);
		combination_verification(Spouse,Father);
		combination_verification(Spouse,Mother);
		combination_verification(Spouse,Father_in_Law);
		combination_verification(Spouse,Mother_in_Law);
		combination_verification(Father,Mother);
		combination_verification(Father,Father_in_Law);
		combination_verification(Father,Mother_in_Law);
		combination_verification(Mother,Father_in_Law);
		combination_verification(Mother,Mother_in_Law);
		combination_verification(Father_in_Law,Mother_in_Law);
		
		
		// Test_Case3();

	}
	

	public static void Edit_Quote_Member_Selection() throws Exception 
	{
		
		Thread.sleep(5000);
		
		
		
		Add_member = driver.findElement(By.xpath("//p[@class='add_member']"));
		wait.until(ExpectedConditions.elementToBeClickable(Add_member));
		Add_member.click();
		Thread.sleep(1000);
		
		
		Self = driver.findElement(By.xpath("(//label[@class='checkbox']//span)[1]"));
		Spouse = driver.findElement(By.xpath("(//label[@class='checkbox']//span)[1]"));
		Son = driver.findElement(By.xpath("(//label[@class='checkbox']//span)[3]"));
		Daughter = driver.findElement(By.xpath("(//label[@class='checkbox']//span)[4]"));
		Father = driver.findElement(By.xpath("(//label[@class='checkbox']//span)[5]"));
		Mother = driver.findElement(By.xpath("(//label[@class='checkbox']//span)[6]"));
		Father_in_Law = driver.findElement(By.xpath("(//label[@class='checkbox']//span)[7]"));
		Mother_in_Law = driver.findElement(By.xpath("(//label[@class='checkbox']//span)[8]"));
		Done_Button = driver.findElement(By.xpath("//button[@class='btn_comon orange_btn edit_quote_member']"));
		
		
		
		Thread.sleep(1000);
		Self.click();
		Thread.sleep(1000);
		Done_Button.click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		
		combination_verification(Self,Spouse);
		combination_verification(Self,Mother);
		combination_verification(Self,Father);
		combination_verification(Self,Mother);
		combination_verification(Self,Father_in_Law);
		combination_verification(Self,Mother_in_Law);
		combination_verification(Spouse,Mother);
		combination_verification(Spouse,Father);
		combination_verification(Spouse,Mother);
		combination_verification(Spouse,Father_in_Law);
		combination_verification(Spouse,Mother_in_Law);
		combination_verification(Father,Mother);
		combination_verification(Father,Father_in_Law);
		combination_verification(Father,Mother_in_Law);
		combination_verification(Mother,Father_in_Law);
		combination_verification(Mother,Mother_in_Law);
		combination_verification(Father_in_Law,Mother_in_Law);
		
		
	
	}
	

} // Class END
