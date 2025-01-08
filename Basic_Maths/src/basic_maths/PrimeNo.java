package basic_maths;

public class PrimeNo {
	public static boolean isPrime(int num) {
		//Your code goes here
		if (num < 2) {	
			return false;
		}
			for(int i = 2; i<num;i++) {
				if(num % i ==0) {
					return false;
				}
			}
		return true;	
	}
	public static void main(String[] args) {
		System.out.println(isPrime(5));
	}
}