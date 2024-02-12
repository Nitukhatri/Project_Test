package Care_Advantage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Addons_Advantage {

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

	public Addons_Advantage(WebDriver driver,String NCB_Super,String Care_Shield,String Co_Payment_Wavier,String Room_Rent_Modification,String Smart_Select,String Annual_Health_Check_up,String Air_Ambulance_Cover,String Reduction_in_PED_wait_in_Period, String Care_OPD,String Additional_Coverage) throws Exception
	{
		
		Actions action = new Actions(driver);
		
		// TODO Auto-generated constructor stub
		Thread.sleep(1000);
		
		WebElement addon_button = driver.findElement(By.xpath("//button[@class='addition_co_btn']"));
		addon_button.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='tab_heading own_link2']")).click();
		
		Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		
		//NCB Super
		if(!NCB_Super.contentEquals("0"))
		{
			//driver.findElement(By.xpath("//label//b[text()='NCB Super']")).click();
			
			Thread.sleep(1000);
		}
		
		//Care Shield
		if(!Care_Shield.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label//b[text()='Care Shield']")).click();
			Thread.sleep(1000);
		}
		
		//Room Remt Modification
		if(!Room_Rent_Modification.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label//b[text()='Room Rent Modification ']")).click();
			Thread.sleep(1000);
		}
		
		//Smart Select
		if(!Smart_Select.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label//b[text()='Smart Select ']")).click();
			Thread.sleep(1000);
		}
			
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(500);
		
		//Annual Health Check up
		if(!Annual_Health_Check_up.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label//b[text()='Annual Health Check-up']")).click();
			Thread.sleep(1000);
		}
	
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(500);
	
		//Air Ambulance
		if(!Air_Ambulance_Cover.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label//b[text()='Air Ambulance Cover']")).click();
			Thread.sleep(1000);
		}
	
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(500);	
	
		//PED wait period modification
		if(!Reduction_in_PED_wait_in_Period.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label//b[text()='PED wait period modification ']")).click();
			Thread.sleep(1000);
		}
		
		// Care OPD
		if(!Care_OPD.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label//b[text()='Care OPD']")).click();
			Thread.sleep(1000);
		}
		
		
		//Done button
	
		driver.findElement(By.xpath("//button[@onclick='selectPremiumPlans(); addOnsDone()']")).click();
		
	}
	
}
