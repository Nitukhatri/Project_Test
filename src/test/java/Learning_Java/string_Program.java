package Learning_Java;

import java.util.Arrays;

public class string_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		program1();
		System.out.println("--------------------------------");
		program2();
		System.out.println("--------------------------------");
		program3();
		System.out.println("--------------------------------");
		program4();
		System.out.println("--------------------------------");
		program5();
		System.out.println("--------------------------------");
		program6();
		System.out.println("--------------------------------");
		program7();
		System.out.println("--------------------------------");
		program8();
		System.out.println("--------------------------------");
		program9();
		System.out.println("--------------------------------");
		program10();
		System.out.println("--------------------------------");
	}

	public static void program1() {
		
		String name = "adfgafghaeraolkijajmhnaiujnajhakjhnasaaaagbahgajhgaahngashngbanbaakjh";
		
		String str1 = "" , str2 = "" ;
		
		for (int i = 0; i<name.length();i++)
		{	
			char c = name.charAt(i);
			
			if(c=='a')
			{
				str1 = str1 + Character.toString(c);	
			}
			else
			{
				str2 = str2 + Character.toString(c);
			}
		}
			System.out.println(str1 + str2);

	}

	// String program to print Even length words in a String
	
	public static void program2()
	{
		String str = "My Name is nitu";
		
		String[] word = str.split(" ");
		
		for(String w : word)
		{
			System.out.println(w);
		}
				
		for(int i = word.length-1; i>=0 ; i--)
		{
			System.out.println(word[i]);
		}
	}	
	
	
	//Java String Program to Insert a string into another string
	/*
	 * Input: originalString = "GeeksGeeks", stringToBeInserted = "For", 
	 * Output: "GeeksForGeeks"
	 */
	
	public static void program3() {
		
		String originalString = "GeeksGeeks", stringToBeInserted = "For" ;
		
		System.out.println("Original String : " + originalString );
		System.out.println("String To Be Inserted : "+ stringToBeInserted);
		
//		char[] stack = originalString.toCharArray();
		int index = 4;
		String stack="";
		
		for(int i = 0; i<originalString.length();i++)
		{		
			stack = stack + originalString.charAt(i);	
			if(i==index)
			{
				stack = stack + stringToBeInserted;
			}
		}
		System.out.println("String After Modification : "+ stack );	
	}
	
	//Java program to check whether a string is a Palindrome
	public static void program4() {
		
		String name ="my name eman ym", reverse = "";
		
		for(int i = name.length()-1; i>=0 ; i--)
		{
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println(name + "\n" +reverse);
	
		// System.out.println(name.contentEquals(reverse));
		
		if(name.length()==reverse.length())
		for(int i =0 ; i< name.length() ; i++)
		{
			if(name.charAt(i)!=reverse.charAt(i))
			{
				System.out.println("Not Same");
				break;
			}
		}
	}
	
	
	//Java Program To Check Whether Two Strings Are Anagram

	public static void program5() {
		
		String str1 ="A decimal point", str2="Im a dot in place";
		str1 = str1.replace(" ", "").toLowerCase();
		str2 = str2.replace(" ", "").toLowerCase();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		System.out.println(String.valueOf(ch1));
		Arrays.sort(ch2);
		System.out.println(String.valueOf(ch2));
		
		
		System.out.println();

		Boolean result = null; 
		if(str1.length()==str2.length())
			for(int i =0 ; i<str1.length() ; i++)
			{
				if(ch1[i]!=ch2[i])
				{
					result = false;
					break;
				}
				else
				{
					result = true;
				}
			}		
		System.out.println(result);
	}
	
	// Reverse a string in Java
	public static void program6() {
	
		String name ="my name is nitu", reverse = "";
		
		for(int i = name.length()-1; i>=0 ; i--)
		{
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println(name + "\n" +reverse);
	}
	
	//	Java Program to Add Characters to a String
	public static void program7() {
		
		String originalString = "GeeksGeeks", stringToBeInserted = "AddedWord" ;
		
		String EndString = originalString+stringToBeInserted;
		String StartString = stringToBeInserted+originalString;
		
		System.out.println("Original String :" + originalString);
		System.out.println("String To Be Inserted :" + stringToBeInserted);
		System.out.println("End String : " + EndString);
		System.out.println("Start String : " + StartString);
	}
	
	//	Java Program to Iterate Over Characters in String
	public static void program8() {
		
		String name = "ThisStringisforTesting";
		
		for(int i =0 ; i<name.length();i++)
		{
			System.out.print(name.charAt(i)+" ");
		}
	}
	
	//	Swapping Pairs of Characters in a String in Java
	
	public static void program9() {
		
		String name = "java programing java is not easy java";
		
		//	name = name.replaceAll("java", "pagal");
		//	System.out.println(name);
		
		for(int i = 0; i<name.length();i++)
		{
			
			 if('a' == name.charAt(i))
			 {
				 System.out.print("b"); 
			 }
			 else if('j' == name.charAt(i))
			 {
				 System.out.print("c"); 
			 }
			 else
			 {
				 System.out.print(name.charAt(i)); 
			 }
		}
	}
	
	//	Replace a character at a specific index in a String in Java
	public static void program10() {
		
		String str = "This is java Programming";
		char ch = 'T';
		int index= 8;
		str = str.substring(0,index)+ch+str.substring(index+1); 
		System.out.println(str);
	}
	
	
}
