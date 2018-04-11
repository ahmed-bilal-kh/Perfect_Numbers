/*
 * In this program a perfect number is a value whose factors(excluding the value
 * itself) sum up to the value in question i.e. 1+2+3=6 
 */
public class findPerfectNumber {

		public static void main(String args[])
	    {    
	        for (int i = 1; i <= 10000; i++) 
	        {
	        	int aValue = i;
	        	int sum = 0;
	        	 
	            for(int divisor=1; divisor < aValue; divisor++)
	            {
	                if ((aValue % divisor) ==0) 
	                {
	                    sum = sum + divisor; 
	                }
	            }
				if(sum==aValue)
	            {
	            	System.out.println(aValue+" = "+"sum of all the number's factors except itself"); 
	            }
	        }
	    }
	}
