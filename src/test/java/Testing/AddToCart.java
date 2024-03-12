package Testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCart extends Demoblaze_Category {
	
	public static void main(String[] args) throws Exception  {
	        
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	        new DemoBlaze();
	        
	        Product_ProductName("Laptops", "Sony vaio i5");
	        Btn_AddToCart();   
	      
	        Product_ProductName("Phones", "Samsung galaxy s6");
	        Btn_AddToCart();
	        
	        Product_ProductName("Monitors", "Apple monitor 24");
	        Btn_AddToCart();
	        
	        Product_ProductName("Phones", "Nokia lumia 1520");
	        Btn_AddToCart();
	        
	        Product_ProductName("Phones","Nexus 6");
	        Btn_AddToCart();
	        
	        Product_ProductName("Phones","Iphone 6 32gb");
	        Btn_AddToCart();
	        
	        Product_ProductName("Laptops", "Sony vaio i7");
		    Btn_AddToCart();   

	        Product_ProductName("Laptops", "MacBook air");
		    Btn_AddToCart();   
		    
	        Product_ProductName("Laptops", "Dell i7 8gb");
		    Btn_AddToCart();   
		    
		    Product_ProductName("Monitors", "ASUS Full HD");
	        Btn_AddToCart();

	        Cart();
	        Cart_Price();
	        Thread.sleep(500);
	        Remove_Product("Sony vaio i5");
	        Thread.sleep(500);
	        Cart_Price();
	        Thread.sleep(5000);
	      //  driver.close();
	    }

	public static void Btn_AddToCart() throws Exception 
	{
		
			//String Price = driver.findElement(By.xpath("//div//h3[@class='price-container']")).getText().toString();
			try
			{
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[text()='Add to cart']")).click();		
			}catch (Exception e) {
				System.out.println("Add to cart Exception : " + e);
			}
		
	        
	        Thread.sleep(2000);
	        driver.switchTo().alert().accept();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//a[text()='Home ']")).click();
	  
	}
	
	public static void Cart() throws Exception
	{

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
	
	}
	
	public static void Cart_Price() throws Exception {
			
		
			Thread.sleep(3000);
			
		//	String price =	driver.findElement(By.xpath("(//tbody[@id='tbodyid']//tr//td[3])[1]")).getText().toString();
			
			
			  List <WebElement> Selected_total_Price = driver.findElements(By.xpath("//tbody[@id='tbodyid']//tr//td[3]"));
			  
			  
			  int p =0 ; 
			  for(WebElement STP : Selected_total_Price) 
			  {
			  
				  p = p + Integer.valueOf(STP.getText().toString()); 
				//  System.out.println( p); 
			  }
			  	
			//  System.out.println("Selected Total Price : " + p);
			 
			  int Final_Price = Integer.valueOf(driver.findElement(By.xpath("//h3[@id='totalp']")).getText().toString());
		 
			  
			  
			  if(Final_Price == p)
			  {
				  System.out.println("Calculated Price and Total Price are same : " + Final_Price + " : " + p);
			  }
			  else
			  {
				  System.out.println("Calculated Price and Total Price are not same : " + Final_Price + " : " + p);
			  }  
	}
	
	public static void Remove_Product(String Product_Remove) throws Exception 
	{
		Thread.sleep(1000);
		List <WebElement> Remove_Product = driver.findElements(By.xpath("//tbody[@id='tbodyid']//tr//td[2]"));
		
		int i = 1;
		for(WebElement r : Remove_Product)
		{
			String RP = r.getText().toString();
		
			if (Product_Remove.contains(RP)) 	
			{
				 String path = "(//tbody[@id='tbodyid']//tr//td[4])["+ i +"]//a";
				 Thread.sleep(1000);
				driver.findElement(By.xpath(path)).click();
				System.out.println(Product_Remove + "has been removed.");
			}
			 i++;
		}

		Thread.sleep(5000);
	}
	
}
