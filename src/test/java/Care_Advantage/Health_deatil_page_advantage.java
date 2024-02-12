package Care_Advantage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Health_deatil_page_advantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Health_deatil_page_advantage(WebDriver driver) throws Exception
	{
		driver.findElement(By.xpath("(//input[@class='existingdisease existingdisease1'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='existingdisease existingdisease2'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='existingdisease existingdisease3'])[2]")).click();
						
        Thread.sleep(1000);
        
		Actions action = new Actions(driver);
		
		//scroll down a page
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(500);
        // TnC checkbox
        WebElement TnC = driver.findElement(By.xpath("//div[@class='proposaltermscondition']/label/p"));
        TnC.click();
        
		//scroll down a page
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

        // driver.findElement(By.className("btn_comon close exp_propsal_btn"));
        // next button 
        WebElement btn_next = driver.findElement(By.xpath("//button[@class='btn_comon green_btn healthQuestionnaireForm']"));
		btn_next.click();
		
		Thread.sleep(10000);
	}
	
}
