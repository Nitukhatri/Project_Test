package Gmail;

import java.time.Duration;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SendResumeMailToHr {

//	public static WebDriver driver =new ChromeDriver();
//	public static 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	// 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//	driver.manage().window().maximize(); 	
		
		// Assuming you have already opened a Chrome browser manually

        // Set the URL for the Selenium Grid hub (assuming it's running on localhost)

//        URL hubUrl = new URL("http://localhost:4444/wd/hub");

	       URI uri = new URI("http://localhost:1900/wd/hub");
	       URL url = uri.toURL();

        // Create ChromeOptions object to configure the browser settings
        ChromeOptions options = new ChromeOptions();

        // Connect to the existing browser session using the session ID
        WebDriver driver = new RemoteWebDriver(url, options);

        // Now you can interact with the existing browser window programmatically
        // For example, you can navigate to a URL
    	driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
    	

		
		System.out.println("..........END..........");
	}
	
	
	
	/*
	
	static boolean displayed;
	
	public static WebElement email, sign_in;
	static String value ;
	public static void signin_Try() {
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@data-action='sign in']"))));
		sign_in = driver.findElement(By.xpath("//a[@data-action='sign in']"));
    	displayed =sign_in.isDisplayed();
    	sign_in.click();

     	email.sendKeys("nitukhatri94@gmail.com");
		driver.findElement(By.xpath("//button//span[text()='Next']")).click();
			

	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 	
    	email =	driver.findElement(By.xpath("//input[@id='identifierId']"));
		int count =1;
    	try
		{
			
    	do {
    		System.out.println(count++);
    		
    		wait.until((ExpectedConditions.visibilityOf(email)));
    		
			email.sendKeys("nitukhatri94@gmail.com");
			driver.findElement(By.xpath("//button//span[text()='Next']")).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@aria-label='Try again']"))));
				
			driver.findElement(By.xpath("//a[@aria-label='Try again']")).click();			
			
			try
			{
		//	wait.until(ExpectedConditions.visibilityOf(email));
			 displayed = email.isDisplayed();
			
			 value="email displayed........";
		
			}catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@data-action='sign in']"))));
				sign_in = driver.findElement(By.xpath("//a[@data-action='sign in']"));
		    	displayed =sign_in.isDisplayed();
		    	sign_in.click();
		    	value="sign displayed........";
			}
		 
		    	

			System.err.println(displayed +"......."+value);
			
		}while(displayed);
		}catch (Exception e) {
//			System.out.println(e);
		}
    	System.err.println(displayed +"........"+value);
		
//    	email.sendKeys("nitukhatri94@gmail.com");
//		driver.findElement(By.xpath("//button//span[text()='Next']")).click();
	
	}
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	

}
