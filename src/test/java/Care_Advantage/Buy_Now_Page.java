package Care_Advantage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buy_Now_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Buy_Now_Page(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		if(driver.findElement(By.xpath("//button[@class='buy_for_btn']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='buy_for_btn']")).click();
		}
	}
}
