package Care_Supreme_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Supreme_Member_Selection {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Supreme_Member_Selection(WebDriver driver, String Self, String Spouse, String Son, String Son1, String Daughter, String Daughter1, String Father, String Mother, String Father_in_Law, String Mother_in_Law) throws Exception 
	{
		// TODO Auto-generated constructor stub
	//	int count = 0;
	//	Thread.sleep(1000);
		
		//Unselect default Self
	
		String member_pre_selection_value = driver.findElement(By.xpath("//div//input[@id='self']")).getAttribute("value");
		System.out.println(member_pre_selection_value + " : self");
		if(member_pre_selection_value.contentEquals("1"))
		{
			driver.findElement(By.xpath("//label[@for='self']")).click();
			Thread.sleep(500);
		}	
		
		if(!Self.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label[@for='self']")).click();
			Thread.sleep(1000);
		}
				
		if(Spouse != "0")
		{
			driver.findElement(By.xpath("//label[@for='spouse']")).click();
			Thread.sleep(500);
		}
		
		if(Son != "0")
		{
			driver.findElement(By.xpath("//label[@for='son']")).click();
			Thread.sleep(500);
				
			if(Son1 != "0")
			{
				driver.findElement(By.xpath("//label[@for='son']//div/span[2]")).click();
				Thread.sleep(500);
			}
		}
		if(Daughter != "0")
		{
			driver.findElement(By.xpath("//label[@for='daughter']")).click();
			Thread.sleep(500);
			
			if(Daughter1 != "0")
			{
				driver.findElement(By.xpath("//label[@for='daughter']//div/span[2]")).click();
				Thread.sleep(500);
			}
			
		}
		
		if(Daughter1 != "0")
		{
			
		}
		
		if(Father != "0")
		{
			driver.findElement(By.xpath("//label[@for='father']")).click();
			Thread.sleep(500);
		}
		
		if(Mother != "0")
		{
			driver.findElement(By.xpath("//label[@for='mother']")).click();
			Thread.sleep(500);
		}
		
		if(Father_in_Law != "0")
		{
			driver.findElement(By.xpath("//label[@for='father-in-law']")).click();
			Thread.sleep(500);
		}
		
		if(Mother_in_Law != "0")
		{
			driver.findElement(By.xpath("//label[@for='mother-in-law']")).click();
			Thread.sleep(500);
		}
		
		Thread.sleep(1000);
	//	count++;
		WebElement btn = driver.findElement(By.xpath("//a[@class='btn_custom step2_continue']"));
		btn.click();
	}
}
