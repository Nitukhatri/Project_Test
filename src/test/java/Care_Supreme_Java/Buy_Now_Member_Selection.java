package Care_Supreme_Java;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.management.relation.Relation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buy_Now_Member_Selection {

	static WebElement Self, Spouse, Son, Son1_add, Son1_minus, Daughter, Daughter1_add, Daughter1_minus, Father, Mother, Father_in_Law, Mother_in_Law, Done_Button, Add_member, Error_msg_element, Self_dropdown, Spouse_dropdown, Son_dropdown, Son1_dropdown, Daughter_dropdown, Daughter1_dropdown, Father_dropdown, Mother_dropdown, Father_in_Law_dropdown, Mother_in_Law_dropdown;
	
//	static Collection<? extends WebElement> 
	static List<WebElement> Self_dropdown_list, Spouse_dropdown_list, Son_dropdown_list, Son1_dropdown_list, Daughter_dropdown_list, Daughter1_dropdown_list, Father_dropdown_list, Mother_dropdown_list, Father_in_Law_dropdown_list, Mother_in_Law_dropdown_list;

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static WebElement[] Buy_Now_add_Member_Selection(WebDriver driver) throws Exception 
	{
		
		driver.manage().window().fullscreen();
		
		// TODO Auto-generated constructor stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
		Thread.sleep(1000);
		

		Add_member = driver.findElement(By.xpath("//div//p[@class='add_member']"));
		wait.until(ExpectedConditions.elementToBeClickable(Add_member));	
		
		Add_member.click();
		Thread.sleep(1000);	

		Self = driver.findElement(By.xpath("(//label[@class='checkbox'])[1]"));
		Spouse = driver.findElement(By.xpath("(//label[@class='checkbox'])[2]"));
		Son = driver.findElement(By.xpath("(//label[@class='checkbox'])[3]"));
		Son1_add = driver.findElement(By.xpath("(//div//span[@class='addplus'])[1]"));
		Son1_minus = driver.findElement(By.xpath("(//div//span[@class='minus'])[1]"));	
		Daughter = driver.findElement(By.xpath("(//label[@class='checkbox'])[4]"));
		Daughter1_add = driver.findElement(By.xpath("(//div//span[@class='addplus'])[2]"));
		Daughter1_minus = driver.findElement(By.xpath("(//div//span[@class='minus'])[2]"));
		Father = driver.findElement(By.xpath("(//label[@class='checkbox'])[5]"));
		Mother = driver.findElement(By.xpath("(//label[@class='checkbox'])[6]"));
		Father_in_Law = driver.findElement(By.xpath("(//label[@class='checkbox'])[7]"));
		Mother_in_Law = driver.findElement(By.xpath("(//label[@class='checkbox'])[8]"));
		Done_Button = driver.findElement(By.xpath("//button[@class='btn_comon orange_btn edit_quote_member closemember']"));
		Error_msg_element = driver.findElement(By.xpath("//span[@class='error-age panel_cont_inner']"));
		
		 
		Self.click();
		Thread.sleep(1000);
		Done_Button.click();
		Thread.sleep(1000);
	
	//	WebElement relation[]=null;
	
	/*	Spouse.click();
		Thread.sleep(1000);
		Son.click();
		Thread.sleep(1000);
		Son1_add.click();
		Thread.sleep(1000);
		Daughter.click();
		Thread.sleep(1000);
		Daughter1_add.click();
		Thread.sleep(1000);
		Father.click();
		Thread.sleep(1000);
		Mother.click();
		Thread.sleep(1000);
		Father_in_Law.click();
		Thread.sleep(1000);
		Mother_in_Law.click();
		Thread.sleep(1000);
		Done_Button.click();
		Thread.sleep(3000);
		
			

		Mother_in_Law_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input   adult mother-in-law1age ']//div"));
		Mother_in_Law_dropdown.click();
		Thread.sleep(1000);
		Mother_in_Law_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult mother-in-law1age in']//ul//li"));

		Father_in_Law_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input adult father-in-law1age']//div"));
		Father_in_Law_dropdown.click();
		Thread.sleep(1000);
		Father_in_Law_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult father-in-law1age in']//ul//li"));
		
		Mother_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input adult mother1age']//div"));
		Mother_dropdown.click();
		Thread.sleep(1000);
		Mother_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult mother1age in']//ul//li"));
		
		Father_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input adult father-in-law1age']//div"));
		Father_dropdown.click();
		Thread.sleep(1000);
		Father_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult father1age in']//ul//li"));
	
		Daughter1_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input childclass children daughter2age']//div"));
		Daughter1_dropdown.click();
		Thread.sleep(1000);
		Daughter1_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input childclass children daughter2age in']//ul/li"));
	
		Daughter_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input childclass children daughter1age']//div"));
		Daughter_dropdown.click();
		Thread.sleep(1000);
		Daughter_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input childclass children daughter1age in']//ul/li"));
	
		Son1_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input childclass children son2age']//div"));
		Son1_dropdown.click();
		Thread.sleep(1000);
		Son1_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input childclass children son2age in']//ul//li"));
	
		Son_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input childclass children son1age']//div"));
		Son_dropdown.click();
		Thread.sleep(1000);
		Son_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input childclass children son1age in']//ul//li"));
	
		Spouse_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input adult spouse1age']//div"));		
		Spouse_dropdown.click();
		Thread.sleep(1000);
		Spouse_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult spouse1age in']//ul//li"));
	
		Self_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input selfage selfage selected adult']//div"));
		Self_dropdown.click();
		Thread.sleep(1000);
		Self_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input selfage selfage selected adult in']//ul//li"));
	*/
		
/*		Self_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input selfage selfage selected adult']//div"));
		Self_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input selfage selfage selected adult in']//ul//li"));
		Spouse_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input adult spouse1age']//div"));		
		Spouse_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult spouse1age in']//ul//li"));
		Son_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input childclass children son1age ']//div"));
		Son_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input childclass children son1age in']//ul//li"));
		Son1_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input childclass children son2age ']//div"));
		Son1_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input childclass children son2age in']//ul//li"));
		Daughter_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input childclass children daughter1age']//div"));
		Daughter_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input childclass children daughter1age in']//ul/li"));
		Daughter_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input childclass children daughter2age']//div"));
		Daughter_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input childclass children daughter2age in']//ul/li"));
		Father_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input   adult father1age ']//div"));
		Father_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult father1age in']//ul//li"));
		Mother_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input adult mother1age']//div"));
		Mother_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult mother1age in']//ul//li"));
		Father_in_Law_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input   adult father-in-law1age ']//div"));
		Father_in_Law_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult father-in-law1age in']//ul//li"));
		Mother_in_Law_dropdown = driver.findElement(By.xpath("//div[@class='form_input borderdinput age_input adult mother-in-law1age']//div"));
		Mother_in_Law_dropdown_list = driver.findElements(By.xpath("//div[@class='form_input borderdinput age_input adult mother-in-law1age in']//ul//li"));
*/
		
		WebElement relation[]= {
									Self,
									Spouse,
									Son,
									Son1_add,
									Son1_minus,	
									Daughter,
									Daughter1_add,
									Daughter1_minus,
									Father,
									Mother,
									Father_in_Law,
									Mother_in_Law,
									Done_Button,
									Error_msg_element,
									Add_member,
									Self_dropdown, 
									Spouse_dropdown, 
									Son_dropdown, 
									Son1_dropdown, 
									Daughter_dropdown, 
									Daughter1_dropdown, 
									Father_dropdown, 
									Mother_dropdown, 
									Father_in_Law_dropdown, 
									Mother_in_Law_dropdown
				
								};

/*		WebElement relation_dropdown[] = {
											Self_dropdown, 
											Spouse_dropdown, 
											Son_dropdown, 
											Son1_dropdown, 
											Daughter_dropdown, 
											Daughter1_dropdown, 
											Father_dropdown, 
											Mother_dropdown, 
											Father_in_Law_dropdown, 
											Mother_in_Law_dropdown
										};
		*/
		
/*	List<WebElement>[] relation_dropdown_list = new ArrayList[10];
		
		relation_dropdown_list[0] = Self_dropdown_list;
		relation_dropdown_list[1] = Spouse_dropdown_list;
		relation_dropdown_list[2] = Son_dropdown_list;
		relation_dropdown_list[3] = Son1_dropdown_list;
		relation_dropdown_list[4] = Daughter_dropdown_list;
		relation_dropdown_list[5] = Daughter1_dropdown_list;
		relation_dropdown_list[6] = Father_dropdown_list;
		relation_dropdown_list[7] = Mother_dropdown_list;
		relation_dropdown_list[8] = Father_in_Law_dropdown_list;
		relation_dropdown_list[9] = Mother_in_Law_dropdown_list;
*/	
		
	/*	Spouse.click();
		Thread.sleep(1000);
		Son.click();
		Thread.sleep(1000);
		Daughter.click();
		Thread.sleep(1000);
		Father.click();
		Thread.sleep(1000);
		Mother.click();
		Thread.sleep(1000);
		Father_in_Law.click();
		Thread.sleep(1000);
		Mother_in_Law.click();
		Thread.sleep(1000);
		Done_Button.click();
		Thread.sleep(3000);
*/
		
/*		Object relation_array[]= {
										relation,
									//	relation_dropdown,
										relation_dropdown_list
									};
		*/
		
		
		return relation;
	}
	
	
	
	
	
	
}
