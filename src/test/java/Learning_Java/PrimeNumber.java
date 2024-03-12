package Learning_Java;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
			prime_Number_Method(11);
		
	}
	
	public static void prime_Number_Method(int n) {
		
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}	
		
	if(count==2)
	{
		System.out.println(n +" This is prime number");
	}
	else
	{
		System.out.println(n + " This is not a Prime number.");
	}

	}
	

}
