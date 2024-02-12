package Learning_Java;

public class demo_3string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " !@^%$##&^&)(&.,    @ qwer t y@uio poiuytrjkmnb@vcfgkjvcf@uikhgfdhjmnbvcfyujnbvcdftyujnbvcxdfyjjbvcfghjnbvcghjnbvcghjnbvghnb vghjnb vhnbvbmnb vbhjmnbvbmnb vhjmnbvhjnbvhjmnbv";
		
		//System.out.println(s +"\n" + s.length());
		
		System.err.println(s);
		System.out.println(s.length());
		
		for (int i = 0; i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			
			if(s.charAt(i)=='@')
			{
				System.err.println("This is @" +" : "+ i);
			}
		}
		
		s=s.toUpperCase();
		System.err.println(s);
		
		System.out.println("new String for aaa");
		String name = "aqwertasdqweasdqwertyugfdsaqwswaeartyuacvabnaaabvfgajnagyjanbvghanbvagjanbgh";

		//System.out.println(name);
		
		int count=0;
		for (int i = 0; i<name.length();i++)
		{
			
			if(name.charAt(i)=='a')
			{
				count= ++count;
			}
		}
		
		System.err.println(count);
		
		for (int i=0;i<count;i++)
			System.out.print("a");

		for (int i = 0; i<name.length();i++)
		{			
			if(name.charAt(i)!='a')
			{
				System.out.print(name.charAt(i));
			}
		}

		
	}
}
