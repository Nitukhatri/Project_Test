package Learning_Java;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 =1, fab =0;
//		current=current+next;
		
		for(int i = 0; i <10;i++)
		{
			System.out.println(num1);
			fab = num1 + num2;
	
			num1=num2;
			num2=fab;
		}
		
	}

}
