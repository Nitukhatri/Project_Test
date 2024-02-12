package Care_Supreme;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {

	@DataProvider
	public static Object[][] get_mobile_number(Method name)
	{
		Object[][] mobile_number = {{"9876543210"}};
		return mobile_number;
	}

	@DataProvider
	public static Object[][] member_selection(Method name)
	{
		Object [][] members = {{"self","spouse","son","daughter"}};
		
		return members;
	}
	
	@DataProvider
	public static Object[][] members_age(Method name)
	{
		Object[][] age = {{"30","28","10","10"}};
		return age;
	}
	
	@DataProvider
	public static Object[][] get_pincode(Method name)
	{
		Object[][] pin_code = {{"124001"}};
		return pin_code;
	}
	
	@DataProvider
	public static Object[][] insured_member_age(Method name)
	{
		Object[][] members_age = {{"11111993","11111998","11112013","11112013"}};
		
		return members_age;
	}
}
