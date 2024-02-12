package Care_Supreme_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buy_Now_Page {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Buy_Now_Page() 
	{
		// TODO Auto-generated constructor stub
		if(driver.findElement(By.xpath("(//div[@class='modal-inner-content'])[10]")).isDisplayed())
		{
			driver.findElement(By.xpath("(//div[@class='modal-inner-content'])[10]/span")).click();
		}
	}
}
