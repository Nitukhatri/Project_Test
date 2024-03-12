package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demoblaze_Category extends DemoBlaze {

    
	public static List<WebElement> category, Product_name_category;
    public static String cat_value, Pro_cat_value ;
    
    public static void Product_ProductName(String Value, String Product_name) throws Exception 
    {
     
    	try 
    	{
        	category = driver.findElements(By.xpath("//div[@class='list-group']//a"));        

            for (WebElement cat: category) 
            {    
            	Thread.sleep(1000);
            	cat_value = cat.getText().toString();
             
            	if(cat_value.contentEquals(Value))
             {
                 System.out.println(cat_value);
                 cat.click();
                 
                 Thread.sleep(2000);
                	
                 Product_name_category = driver.findElements(By.xpath("//div[@id='tbodyid']//div//h4//a"));
               	  
               	  for (WebElement Pro_cat: Product_name_category) 
               	  { 
               		  Thread.sleep(1000); 
               		  
               	  Pro_cat_value = Pro_cat.getText().toString(); 
               	  
               	  if(Pro_cat_value.contains(Product_name)) 
               	  {
               		  System.out.println(Pro_cat_value); 
               		  Pro_cat.click(); 
               		  System.out.println("New Product code working fine.....");
               		  break; 
               		  } 
               	  }
               	  
               }
            
            }
	
    	}catch (Exception e) {
			System.out.println("Exception : " + e);
		}
    }
    
	/*
	 * public static void Phones(String Product_name) throws Exception 
	 * { 
	 * category = driver.findElements(By.xpath("//div[@id='tbodyid']//div//h4//a"));
	 * 
	 * for (WebElement cat: category) { Thread.sleep(1000); cat_value =
	 * cat.getText().toString(); if(cat_value.contains(Product_name)) {
	 * System.out.println(cat_value); cat.click(); break; } }
	 * 
	 * }
	 * 
	 * 
	 * public static void Laptops(String Product_name) throws Exception { category =
	 * driver.findElements(By.xpath("//div[@id='tbodyid']//div//h4//a"));
	 * 
	 * for (WebElement cat: category) { Thread.sleep(1000); cat_value =
	 * cat.getText().toString(); if(cat_value.contains(Product_name)) {
	 * System.out.println(cat_value); cat.click(); break; } } }
	 * 
	 * 
	 * public static void Monitors(String Product_name) throws Exception {
	 * System.out.println("IN Monitors"); category =
	 * driver.findElements(By.xpath("//div[@id='tbodyid']//div//h4//a"));
	 * 
	 * for (WebElement cat: category) { Thread.sleep(1000);
	 * 
	 * cat_value = cat.getText().toString(); if(cat_value.contains(Product_name)) {
	 * System.out.println(cat_value); cat.click(); break; } } }
	 */    
}

