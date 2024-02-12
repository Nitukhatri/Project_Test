package Care_Advantage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Member_Age_Selection_Section_Advantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Member_Age_Selection_Section_Advantage(WebDriver driver,String Self_age,String Spouse_age,String Son_1_age,String Son_2_age,String Son_3_age,String Son_4_age,String Daughter_1_age,String Daughter_2_age,String Daughter_3_age,String Daughter_4_age,String Father_age,String Mother_age,String Father_in_Law_age,String Mother_in_Law_age) throws Exception 
	{
		// TODO Auto-generated constructor stub
		Thread.sleep(1000);		
		if(!Self_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='self']"))).selectByValue(Self_age);
			Thread.sleep(500);
		}
				
		if(!Spouse_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='spouse']"))).selectByValue(Spouse_age);
			Thread.sleep(500);
		}
		
		if(!Son_1_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='son']"))).selectByValue(Son_1_age);
			Thread.sleep(500);
		}
				
		if(!Son_2_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='son1']"))).selectByValue(Son_2_age);
			Thread.sleep(500);
		}
		
		if(!Son_3_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='son2']"))).selectByValue(Son_3_age);
			Thread.sleep(500);
		}
		
		if(!Son_4_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='son3']"))).selectByValue(Son_4_age);
			Thread.sleep(500);
		}
		
		
		if(!Daughter_1_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='daughter']"))).selectByValue(Daughter_1_age);
			Thread.sleep(500);
		}
				
		if(!Daughter_2_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='daughter1']"))).selectByValue(Daughter_2_age);
			Thread.sleep(500);
		}
		
		if(!Daughter_3_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='daughter2']"))).selectByValue(Daughter_3_age);
			Thread.sleep(500);
		}
		
		if(!Daughter_4_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='daughter3']"))).selectByValue(Daughter_4_age);
			Thread.sleep(500);
		}
		
		if(!Father_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='father']"))).selectByValue(Father_age);
			Thread.sleep(500);
		}
				
		if(!Mother_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='mother']"))).selectByValue(Mother_age);
			Thread.sleep(500);
		}
		if(!Father_in_Law_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='father_in_law']"))).selectByValue(Father_in_Law_age);
			Thread.sleep(500);
		}
				
		if(!Mother_in_Law_age.contentEquals("0"))
		{
			new Select(driver.findElement(By.xpath("//select[@id='mother_in_law']"))).selectByValue(Mother_in_Law_age);
			Thread.sleep(500);
		}
		
		Thread.sleep(1000);
	//	System.out.println("before click");
		driver.findElement(By.xpath("//a[@class='btn_custom step3_continue']")).click();
		Thread.sleep(3000);
	}

}
