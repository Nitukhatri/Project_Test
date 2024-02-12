package Care_Advantage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Member_Selection_Section_Advantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Member_Selection_Section_Advantage(WebDriver driver,String Self,String Spouse,String Son_1,String Son_2,String Son_3,String Son_4,String Daughter_1,String Daughter_2,String Daughter_3,String Daughter_4,String Father,String Mother,String Father_in_Law,String Mother_in_Law) throws Exception
	{
		// TODO Auto-generated constructor stub
		
		Thread.sleep(1000);
		// 	System.out.println(Self+Spouse+Son_1+Son_2+Son_3+Son_4);
		
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
			Thread.sleep(500);
		}
				
		if(!Spouse.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label[@for='spouse']")).click();
			Thread.sleep(500);
		}
		
		if(!Son_1.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label[@for='son']")).click();
			Thread.sleep(500);
				
			if(!Son_2.contentEquals("0"))
			{
				driver.findElement(By.xpath("//label[@for='son']//div/span[2]")).click();
				Thread.sleep(500);
			
				if(!Son_3.contentEquals("0"))
				{
					driver.findElement(By.xpath("//label[@for='son']//div/span[2]")).click();
					Thread.sleep(500);
					
					if(!Son_4.contentEquals("0"))
					{
						driver.findElement(By.xpath("//label[@for='son']//div/span[2]")).click();
						Thread.sleep(500);
					}
				}
			}
		}
		
		if(!Daughter_1.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label[@for='daughter']")).click();
			Thread.sleep(500);
			
			if(!Daughter_2.contentEquals("0"))
			{
				driver.findElement(By.xpath("//label[@for='daughter']//div/span[2]")).click();
				Thread.sleep(500);

				if(!Daughter_3.contentEquals("0"))
				{
					driver.findElement(By.xpath("//label[@for='daughter']//div/span[2]")).click();
					Thread.sleep(500);
					
					if(!Daughter_4.contentEquals("0"))
					{
						driver.findElement(By.xpath("//label[@for='daughter']//div/span[2]")).click();
						Thread.sleep(500);
					}
				}
			}
		}
		
		
		if(!Father.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label[@for='father']")).click();
			Thread.sleep(500);
		}
		
		if(!Mother.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label[@for='mother']")).click();
			Thread.sleep(500);
		}
		
		if(!Father_in_Law.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label[@for='father-in-law']")).click();
			Thread.sleep(500);
		}
		
		if(!Mother_in_Law.contentEquals("0"))
		{
			driver.findElement(By.xpath("//label[@for='mother-in-law']")).click();
			Thread.sleep(500);
		}
		
		
		WebElement btn = driver.findElement(By.xpath("//a[@class='btn_custom step2_continue']"));
		btn.click();
	}

}

