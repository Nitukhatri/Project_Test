package Care_Supreme_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Supreme_members_age_section {

//	static WebElement driver;
//	WebElement Self, Spouse, Son, Daughter, Father, Mother, Father_in_Law, Mother_in_Law;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}	// Main END
	
	public Supreme_members_age_section(WebDriver driver, String Self, String Spouse, String Son, String Son1, String Daughter, String Daughter1, String Father, String Mother, String Father_in_Law, String Mother_in_Law) throws Exception 
	{
		
	//	System.out.println(Self + " self age");

		Thread.sleep(2000);		
		if(!Self.contentEquals("0"))
		{
			System.out.println(Self + " self age");
			new Select(driver.findElement(By.xpath("//select[@id='self']"))).selectByValue(Self);
			Thread.sleep(500);
		}
				
		if(Spouse != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='spouse']"))).selectByValue(Spouse);
			Thread.sleep(500);
		}
		
		if(Son != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='son']"))).selectByValue(Son);
			Thread.sleep(500);
		}
				
		if(Son1 != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='son1']"))).selectByValue(Son1);
			Thread.sleep(500);
		}
		if(Daughter != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='daughter']"))).selectByValue(Daughter);
			Thread.sleep(500);
		}
				
		if(Daughter1 != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='daughter1']"))).selectByValue(Daughter1);
			Thread.sleep(500);
		}
		
		if(Father != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='father']"))).selectByValue(Father);
			Thread.sleep(500);
		}
				
		if(Mother != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='mother']"))).selectByValue(Mother);
			Thread.sleep(500);
		}
		if(Father_in_Law != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='father_in_law']"))).selectByValue(Father_in_Law);
			Thread.sleep(500);
		}
				
		if(Mother_in_Law != "0")
		{
			new Select(driver.findElement(By.xpath("//select[@id='mother_in_law']"))).selectByValue(Mother_in_Law);
			Thread.sleep(500);
		}
		
		Thread.sleep(1000);
	//	System.out.println("before click");
		driver.findElement(By.xpath("//a[@class='btn_custom step3_continue']")).click();
		Thread.sleep(3000);
	}


}	// Class Main
