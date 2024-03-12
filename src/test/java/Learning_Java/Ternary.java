package Learning_Java;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 50;
		int b= 80;
		
	//	String s = (a>b)?"a is greater":"b is greater.";
		
		System.out.println((a>b)?"True":"False");
		
		
		int a1=10;  
		int b1=5;  
		int c1=20;  
		System.out.println((a1<b1&&a1<c1)?"true":"false");//false && true = false  
		System.out.println((a1<b1&a1<c1)?"true":"false");//false & true = false  
		
		System.out.println(a1!=b1);
		
		if(a<b || a==b)
		{
			System.out.println("haha");
		}
		
		a=b;
		
		 if(a==b)
		{
			System.out.println("nononono");
		}
		
		 String name = "A" , name2 = "a";
		
		 if(name.equalsIgnoreCase("a") && name =="a")
		 {
			 System.out.println("A and a are same.");
		 }
		 
		 else if(name2 == "a")
		 {
			 System.out.println("A and a are not same.");
		 }
		 
		 
		 int marks = 80;
		 
		 
		 
		 if(marks >=80)
		 {
			 System.out.println("Grade A");
		 }
		 else if(marks <80 || marks >=60)
		 {
			 System.out.println("Grade B");
		 }
		 else if(marks <60 || marks >=40)
		 {
			 System.out.println("Grade c");
		 }
		 else
		 {
			 System.out.println("Fail...");
		 }

		 int x = 10;
		 
		 switch(x)
		 {
		 	case 10:
		 	{
		 		System.out.println("Case 10");
		 		break;
		 	}
		 	case 90:
		 	{
		 		System.out.println("Case 90");
		 		break;
		 	}
		 	case 50:
		 	{
		 		System.out.println("Case 50");
		 		break;
		 	}
		 
		 } 
		 	 
	}
}
