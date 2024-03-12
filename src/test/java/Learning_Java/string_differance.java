package Learning_Java;

public class string_differance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s1 = "JAVA";
		
		char ch[] = {'a','s','f','g','g','d','r','t','t','y','y'};
		
		String s = new String(ch);
		
		System.out.println(s);
		
		System.out.println(new String(ch));
	
		/*
		 * for(int i = 0; i< ch.length ; i++) { s=s+ch[i]; }
		 * 
		 * System.out.println(s);
		 */
		
		String s_upper = "AWEFGFSDFGRFGHGF";
		
		
		 s_upper = s_upper.toLowerCase();
		System.out.println(s_upper);
		
	}

}
