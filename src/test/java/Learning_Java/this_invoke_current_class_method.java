package Learning_Java;

public class this_invoke_current_class_method {

	void method1()
	{
		method2();
		System.out.println("This is Method 1.");
	}
	
	void method2()
	{
		method3();
		System.out.println("This is Method 2.");
	}
	
	void method3()
	{
		method4();
		System.out.println("This is Method 3.");
	}

	void method4()
	{
		System.out.println("This is Method 4.");
	}
	
	public static void main(String[] args) {

		this_invoke_current_class_method obj1 = new this_invoke_current_class_method();
		
		obj1.method1();
		
	}
}
