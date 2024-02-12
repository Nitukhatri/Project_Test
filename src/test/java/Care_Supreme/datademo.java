package Care_Supreme;

import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datademo {

	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test(priority = 2, dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("Test 2");		
	}
	
	@Test(priority = 3)
	public void test5()
	{
		System.out.println("Test 5");		
	}
	
	@Test(priority = 4)
	public void test6()
	{
		System.out.println("Test 6");		
	}
	
	@Test(priority = 5)
	public void test3()
	{		
		System.out.println("Test 3");
	}
	
	@Test(priority = 6, dataProvider = "getdata")
	public void test4(String a)
	{
		System.out.println("Test 4"+":"+a);
	
		int num=100;
		String n= "RAM";
		//0,1,2
		int[] rollno = {1,2,3};
		String name[]= {"Q","W","E"};
		String adress[]= {"aaaaaaa","bbbbbbbb","ccccccc"};
		
		System.out.println(adress[1]);
	//	adress[1]="ddddddddd";
		
		//int len = rollno.length;
		
		for(int i:rollno)
		{
			System.out.println(i);
		}
	//	System.out.println(adress[1]);
		
		for (String na : name)
		{
			System.out.println(na);
		}
		
		//0,1,2,3
		int[][] data= {
				{123},
				{456},
				{789}
		};
		
		
		
	}
	
	
	
	@DataProvider
	public static Object[][] getdata(Method name)
	{
		Object[][] a = {{"Data provider ka data"},{"iuytrewrtyuijgf"},{87654}};
		return a;
	}
}
