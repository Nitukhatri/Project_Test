package Care_Advantage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pincode_selection_Advantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Pincode_selection_Advantage(WebDriver driver,String Pincode,String Citizenship_Status) throws Exception 
	{

		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement city = driver.findElement(By.xpath("//input[@id='pin_code_1']"));
				
		//driver.findElement(By.xpath("//input[@id='pincode_search']"));

	//	wait.until(ExpectedConditions.elementToBeClickable(city));		
	//	city.click();
		Thread.sleep(1000);


		city.sendKeys(Pincode);
		Thread.sleep(5000);

		// TODO Auto-generated constructor stub
	//	   WebElement pin = driver.findElement(By.xpath("//input[@id='city_name']"));
	//	   pin.sendKeys(Pincode);

	  //      Thread.sleep(2000);
	    
	  /*   List<WebElement> city_list = driver.findElements(By.xpath("//ul[contains(@class,'pincode_list cities_list auto-list')]//li"));      
	         
	     for (WebElement e : city_list)
	     { 	    	 
   	 	String city_name = e.getText().toString(); 
   	 
   	 			Thread.sleep(1000);
	    		 e.click();
	    		 break;
	     }
    */
	     Thread.sleep(1000);
	     
    		new Select(driver.findElement(By.xpath("//Select[@id='citizenship_status']"))).selectByVisibleText(Citizenship_Status);
    		Thread.sleep(1000);

	        
	    	Thread.sleep(2000);
    		WebElement submitButton = driver.findElement(By.xpath("//a[@class='btn_custom view_quote']"));
    		submitButton.click();
	        
  	    	Thread.sleep(5000);
  	    	driver.manage().window().fullscreen();  	    	
	}
}
