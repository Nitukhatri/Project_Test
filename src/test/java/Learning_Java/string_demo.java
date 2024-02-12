package Learning_Java;

public class string_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       String str = "My Name is nitu";
		
		String[] word = str.split(" ");
		
		/*
		 * for(String w : word) { System.out.println(w); }
		 */
				
		/*
		 * for(int i = word.length-1; i>=0 ; i--) { System.out.println(word[i]); }
		 */
		
		int num =3;
		String name = "abcabcabcd";
		
		for(int i =0 ; i<name.length();i++)
		{
			if(i!=0)
			{	
				if(i%3==0)
				{
					System.out.print(" ");
					
				}
			}
				System.out.print(name.charAt(i));
			
		}
	}

}
