import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.commandhandler.UploadFile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.PublicApi;
import io.netty.channel.MessageSizeEstimator.Handle;

public class Naukri {

	static	WebDriver driver = new ChromeDriver();
	static 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	static 	JavascriptExecutor js = (JavascriptExecutor) driver;
	static 	String ParentHandle = null;
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("nitukhatri94@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nitu@1212@Khatri");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().window().fullscreen();		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='View' and text()=' profile']")));
		driver.findElement(By.xpath("//a[text()='View' and text()=' profile']")).click();
		
		driver.manage().window().fullscreen();		
			
	//	Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,100)");
		
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\ACER\\OneDrive\\Desktop\\NITU KHATRI.docx");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Search jobs here']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys("Automation Tester");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
				
		
		driver.manage().window().fullscreen();
	//	Thread.sleep(1000);
	
		ParentHandle = driver.getWindowHandle();
		System.out.println("This is Parent handle : " + ParentHandle);
	
	//	Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,2500)");
		
		driver.findElement(By.xpath("//button[@id='filter-freshness']")).click();
		driver.findElement(By.xpath("//a[@data-id='filter-freshness-1']")).click();
	//	Thread.sleep(2000);
		
		Next_Page();
				
		System.out.println("Total Jobs : " + total_jobs);
		System.out.println("Applied Jobs : "+ applied_jobs);
		
		System.out.println("----------THE END----------");
	}
	
	public static void Next_Page() throws Exception {
			
			int page_number = 1 ;
			
			
			while (driver.findElement(By.xpath("//div[@class='styles_pages__v1rAK']//a")).isEnabled()) {
			
				System.out.println("This is page : " + page_number);
				Job_Post();
				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a//span[text()='Next']"))));
			  //  driver.findElement(By.xpath("//div[@class='styles_pages__v1rAK']//a["+page_number+"]")).click();
				driver.findElement(By.xpath("//a//span[text()='Next']")).click();
				page_number++;
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,5100)");
			
				try 
				{
					wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='styles_pages__v1rAK']//a"))));
				}catch (Exception e) 
				{
					System.out.println("Pagination not found.");
				}
				
			//	Thread.sleep(1000);
				js.executeScript("window.scrollBy(0,-5100)");
				Thread.sleep(1000);
			}
	}
	
	public static void Job_Post() throws Exception
	{
		
		System.out.println("Im in Job Post");
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//div[@class='srp-jobtuple-wrapper']//a[@class='title ']"))));
		
		List<WebElement> post = driver.findElements(By.xpath("//div[@class='srp-jobtuple-wrapper']//a[@class='title ']"));
		
		for(WebElement p : post)
		{
			System.out.println("Im in Job Post new tab loop");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(p));
			String new_tab_path = p.getAttribute("href");
			System.out.println("New Path : "+new_tab_path);
			p.click();
				
			Set<String> handles = driver.getWindowHandles();
			
			for(String handle : handles)
			{
				//	System.out.println("handle : "+handle);
				
			if(!handle.equals(ParentHandle))
			{
				System.out.println("Im in ne window of Post");
				driver.switchTo().window(handle);
			//	Thread.sleep(500);
				driver.manage().window().maximize();
			
		//		Thread.sleep(1000);
			
				Apply();
			}
			
			
			else
			{
				// System.out.println("This is Parent Handle.");
			}
			
			}

			driver.close();
			driver.switchTo().window(ParentHandle);
		//	Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,170)");
		
		}
		
	}
		
	static Boolean Apply_button_check;
	static int applied_jobs = 0, total_jobs = 0;
	
		public static void Apply() {
			
			try
			{
				Apply_button_check = driver.findElement(By.xpath("//div[@class='styles_jhc__apply-button-container__5Bqnb']//button[2]")).isDisplayed();
				
				if(Apply_button_check == true)
				{
				    String  Apply_button = driver.findElement(By.xpath("//div[@class='styles_jhc__apply-button-container__5Bqnb']//button[2]")).getAttribute("id").toString();
				
					if(Apply_button.contentEquals("apply-button"))
					{
						
						driver.findElement(By.xpath("//div[@class='styles_jhc__apply-button-container__5Bqnb']//button[2]")).click();
						Thread.sleep(1000);
						System.out.println("This has been APPLIED.");
						applied_jobs++;
					}
					else if(Apply_button.contentEquals("already-applied"))
					{
						System.out.println("Already Applied for this job");
					}
					else 
					{
						System.out.println("This is Company Website job.");
					}
				
					total_jobs++;
				}
						
				
			}catch (Exception e) 
			{
				System.out.println("This is Company Website job.");
			}
		}
		
}
