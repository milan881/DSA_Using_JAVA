package basic_maths;

public class CountDigits {
	
	public static void countDigit(int n) {
		int count = 0;
		while(n>0) {
			int rem = 0;
			rem = n % 10;
			n = n / 10;
			count++;	
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		
		countDigit(5054548);
		
	}

}
