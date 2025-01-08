package basic_maths;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		
		int temp = x;
		int n = 0;
		int rev =0;
		while(temp != 0) {
		
			n = temp % 10;
			rev = (rev*10)+n;
			temp = temp /10;
			
		}
		return x==rev;
    }

	public static void main(String[] args) {
		
		System.out.println("10   :"+isPalindrome(10));
		System.out.println("121  :"+isPalindrome(121));
		System.out.println("-121 :"+isPalindrome(-121));
		

	}
	
}
