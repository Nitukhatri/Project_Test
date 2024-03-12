package Learning_Java;

public class alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * for(char alpha = 'A' ; alpha <= 'Z' ; alpha++) { for(char alpha_incre = 'A' ;
		 * alpha_incre <= 'Z' ; alpha_incre++) { System.out.println(alpha +""+
		 * alpha_incre); } }
		 */		
		
			printString(999);
		
	}
	
	  private static void printString(int columnNumber)
	    {
	        // To store result (Excel column name)
	    /*    StringBuilder columnName = new StringBuilder();
	 
	        while (columnNumber > 0) {
	            // Find remainder
	            int rem = columnNumber % 26;
	 
	            // If remainder is 0, then a
	            // 'Z' must be there in output
	            if (rem == 0) {
	                columnName.append("Z");
	                columnNumber = (columnNumber / 26) - 1;
	            }
	            else // If remainder is non-zero
	            {
	                columnName.append((char)((rem - 1) + 'A'));
	                columnNumber = columnNumber / 26;
	            }
	        }
	 
	        // Reverse the string and print result
	        System.out.println(columnName.reverse());
	    */
		  
		  
		  StringBuilder columnName = new StringBuilder();
		  while (columnNumber > 0) 
		  {
			  int rem = columnNumber % 26 ;
			  
			  if(rem == 0)
			  {
				  columnName.append("Z");
			  }
			  else
			  {
				  columnName.append((char)((rem - 1) + 'A'));  
			  }
		  }
		  
		  System.out.println(columnName.reverse());
		  
	    }  
}
