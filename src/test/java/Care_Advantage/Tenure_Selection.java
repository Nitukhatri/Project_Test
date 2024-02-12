package Care_Advantage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tenure_Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Tenure_Selection(WebDriver driver,String Tenure) throws Exception 
	{
		Thread.sleep(1000);
		if(Tenure.contentEquals("1"))
		{
			driver.findElement(By.xpath("//label[@for='p_tenure1']")).click();
			Thread.sleep(5000);
		}
		
		if(Tenure.contentEquals("2"))
		{
			driver.findElement(By.xpath("//label[@for='p_tenure2']")).click();
			Thread.sleep(5000);
		}
		
		if(Tenure.contentEquals("3"))
		{
			driver.findElement(By.xpath("//label[@for='p_tenure3']")).click();
			Thread.sleep(5000);
		}
	}
}

