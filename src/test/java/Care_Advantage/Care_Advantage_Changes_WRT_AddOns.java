package Care_Advantage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.print.DocFlavor.STRING;

import org.apache.poi.hslf.record.CString;
import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Care_Supreme_Java.*;
import Care_Supreme_Java.Get_Quote_Section;
import Care_Supreme_Java.Insured_Member_Detail_Page;
import Care_Supreme_Java.Pincode_Supreme;
import Care_Supreme_Java.Supreme_Member_Selection;
import Care_Supreme_Java.Supreme_members_age_section;

public class Care_Advantage_Changes_WRT_AddOns {
	

	  static ChromeOptions co = new ChromeOptions();
	  static WebDriver driver = new ChromeDriver(co);
	  
	  static Actions action = new Actions(driver);

	  static String mobile_number, Self, Spouse, Son_1, Son_2, Son_3, Son_4, Daughter_1, Daughter_2, Daughter_3, Daughter_4, Father, Mother, Father_in_Law, Mother_in_Law, Self_age, Spouse_age, Son_1_age, Son_2_age, Son_3_age, Son_4_age, Daughter_1_age, Daughter_2_age, Daughter_3_age, Daughter_4_age, Father_age, Mother_age, Father_in_Law_age, Mother_in_Law_age, Pincode , Citizenship_Status, NCB_Super, Care_Shield, Co_Payment_Wavier, Room_Rent_Modification, Smart_Select, Annual_Health_Check_up, Air_Ambulance_Cover, Reduction_in_PED_wait_in_Period, Care_OPD ,SI, Additional_Coverage, Tenure, Communication_Pin_code, Self_DOB, Spouse_DOB, Son_1_DOB, Son_2_DOB,	Son_3_DOB, Son_4_DOB, Daughter_1_DOB, Daughter_2_DOB, Daughter_3_DOB, Daughter_4_DOB, Father_DOB, Mother_DOB, Father_in_Law_DOB, Mother_in_Law_DOB;
	
	  static WebElement last_name, Member_dob, height_inches, weight, height_feet, first_name;


	public static void main(String[] args) throws Exception {
		
		// Set the path to the ChromeDriver executable
	    System.setProperty("wedriver.chrome.driver", "../Selenium_test_project/chromedriver.exe");
	    
	    //	co.addArguments("--remote-allow-origins=*");
	    
	    co.addArguments("--incognito");
	    
	    DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(ChromeOptions.CAPABILITY, co);
	    co.merge(cap);
		    
		   
		    	FileInputStream lead_data = new FileInputStream("C:\\Users\\nitu2\\eclipse-workspace\\Care_Project\\File\\Care Advantage test data.xlsx");

				Workbook workbook = WorkbookFactory.create(lead_data);
				Sheet sheet = workbook.getSheetAt(0);

				String header[] = new String[sheet.getRow(0).getLastCellNum()];
				String ar[] = new String[sheet.getRow(0).getLastCellNum()];
				
				// Loop for ROW
				for(int rowNumber = 1; rowNumber < sheet.getLastRowNum(); rowNumber++) 
				{
				    Row row = sheet.getRow(rowNumber);

				    // Navigate to the webpage where the mobile number field is present
			      //  driver.get("https://careuat.careinsurance.com/product/care-advantage");
			       
				    driver.get("https://careuat.careinsurance.com/product/care-advantage");
				    driver.manage().window().fullscreen();
				 //     driver.manage().deleteAllCookies();
			      			    
				    
				    // Loop for COLUMN
				    for(int columnNumber = 0; columnNumber <  row.getLastCellNum(); columnNumber++) 
				    {
				        Cell cell = row.getCell(columnNumber);
				        
				        if(cell != null) 
				        {
				        	
				        	if(rowNumber==0) 
				        	{
				        		header[columnNumber]=cell.toString();
				        	}
				        	else
				        	{
					    		DataFormatter formatter = new DataFormatter();
					    		ar[columnNumber] = formatter.formatCellValue(cell);
				        		
				       // 		ar[columnNumber]=  NumberToTextConverter.toText(cell.getNumericCellValue());	
				        	}
				        } 
				        
				        System.out.print(ar[columnNumber] + " : ");
				        
				    }	// COLUMN LOOP END
				    
				    System.out.println();
				    	// Assigning values from array


				    mobile_number	=	ar[	0	];
				    Self	=	ar[	1	];
				    Spouse 	=	ar[	2	];
				    Son_1 	=	ar[	3	];
				    Son_2 	=	ar[	4	];
				    Son_3 	=	ar[	5	];
				    Son_4 	=	ar[	6	];
				    Daughter_1 	=	ar[	7	];
				    Daughter_2 	=	ar[	8	];
				    Daughter_3 	=	ar[	9	];
				    Daughter_4 	=	ar[	10	];
				    Father 	=	ar[	11	];
				    Mother 	=	ar[	12	];
				    Father_in_Law 	=	ar[	13	];
				    Mother_in_Law 	=	ar[	14	];
				    Self_age 	=	ar[	15	];
				    Spouse_age 	=	ar[	16	];
				    Son_1_age 	=	ar[	17	];
				    Son_2_age 	=	ar[	18	];
				    Son_3_age 	=	ar[	19	];
				    Son_4_age 	=	ar[	20	];
				    Daughter_1_age 	=	ar[	21	];
				    Daughter_2_age 	=	ar[	22	];
				    Daughter_3_age 	=	ar[	23	];
				    Daughter_4_age 	=	ar[	24	];
				    Father_age 	=	ar[	25	];
				    Mother_age 	=	ar[	26	];
				    Father_in_Law_age 	=	ar[	27	];
				    Mother_in_Law_age 	=	ar[	28	];
				    Pincode 	=	ar[	29	];
				    Citizenship_Status 	=	ar[	30	];
				    NCB_Super 	=	ar[	31	];
				    Care_Shield 	=	ar[	32	];
				    Co_Payment_Wavier 	=	ar[	33	];
				    Room_Rent_Modification 	=	ar[	34	];
				    Smart_Select 	=	ar[	35	];
				    Annual_Health_Check_up 	=	ar[	36	];
				    Air_Ambulance_Cover 	=	ar[	37	];
				    Reduction_in_PED_wait_in_Period 	=	ar[	38	];
				    Care_OPD = ar[39];
				    SI 	=	ar[	40	];
				    Additional_Coverage 	=	ar[	41	];
				    Tenure 	=	ar[	42	];
				    Communication_Pin_code 	=	ar[	43	];
				    Self_DOB 	=	ar[	44	];
				    Spouse_DOB 	=	ar[	45	];
				    Son_1_DOB 	=	ar[	46	];
				    Son_2_DOB	=	ar[	47	];
				    Son_3_DOB 	=	ar[	48	];
				    Son_4_DOB 	=	ar[	49	];
				    Daughter_1_DOB 	=	ar[	50	];
				    Daughter_2_DOB 	=	ar[	51	];
				    Daughter_3_DOB 	=	ar[	52	];
				    Daughter_4_DOB 	=	ar[	53	];
				    Father_DOB 	=	ar[	54	];
				    Mother_DOB 	=	ar[	55	];
				    Father_in_Law_DOB 	=	ar[	56	];
				    Mother_in_Law_DOB	=	ar[	57	];


				        
						//	Get_quote();
				    
				    		new Get_Quote_Section(driver,mobile_number);
						
				    		new Member_Selection_Section_Advantage(driver, Self, Spouse, Son_1, Son_2, Son_3, Son_4, Daughter_1, Daughter_2, Daughter_3, Daughter_4, Father, Mother, Father_in_Law, Mother_in_Law);
				    		
				    		new Member_Age_Selection_Section_Advantage(driver,Self_age,Spouse_age, Son_1_age, Son_2_age, Son_3_age, Son_4_age, Daughter_1_age, Daughter_2_age, Daughter_3_age, Daughter_4_age, Father_age, Mother_age, Father_in_Law_age, Mother_in_Law_age);
				    	//	new Pincode_Supreme(driver, Pincode);
							new	Pincode_selection_Advantage(driver,Pincode,Citizenship_Status);
				    		new Addons_Advantage(driver, NCB_Super, Care_Shield, Co_Payment_Wavier, Room_Rent_Modification, Smart_Select, Annual_Health_Check_up, Air_Ambulance_Cover, Reduction_in_PED_wait_in_Period, Care_OPD ,Additional_Coverage);
				    	//	new Sum_Insured_Selection_Advantage(driver, SI);
				    		new Buy_Now_Page(driver);
				    		new Confirm_proposal_page(driver);
				    		new Proposer_detail_page(driver);
				    		new Insured_Member_Detail_Page_advantage(driver,Self_DOB, Spouse_DOB, Son_1_DOB, Son_2_DOB,	Son_3_DOB, Son_4_DOB, Daughter_1_DOB, Daughter_2_DOB, Daughter_3_DOB, Daughter_4_DOB, Father_DOB, Mother_DOB, Father_in_Law_DOB, Mother_in_Law_DOB);
				    		
				    		new Health_deatil_page_advantage(driver);
				    		
					        System.out.println("DONE......");
					        
					        Thread.sleep(2000);
					       // driver.close();
					
		       		}// ROW LOOP END				
	}

}
