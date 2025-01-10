package basic_maths;

public class SumOfDivisor {

	    public static int sumOfAllDivisors(int n){
	        int ans =0;
	        
	           for (int i = 1; i <= n; i++)
	           {

	            // Calculating the value of 'sumOfDivisors(i)' for current 'i'.
	            for (int j = 1; j * j <= i; j++)
	            {
	                if (i % j == 0)
	                {

	                    // Avoid counting sqrt(i) twice.
	                    if (i / j == j)
	                    {
	                        ans += j;
	                    }
	                    else
	                    {
	                        ans += j + i / j;
	                    }
	                }
	            }
	        }

	        return ans;
	    }
	    
	    public static void main(String[] args) {
			System.out.println(sumOfAllDivisors(5));
		}
}
