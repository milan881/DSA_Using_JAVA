package rec;

public class Fact {

	/*
		static int fac = 1;
	public static void fact(int num, int count) {

		if(count >= num) {
			return;
		}
		fac = num*fac;
		num--;
		fact(num, count);
		
	}
	
	public static void main(String[] args) {
	
		fact(5, 1);
		System.out.println(fac);
		
	}
	*/

	public static int factor(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		return n = n*factor(n-1);
	} 
	
	public static void main(String[] args) {
		System.out.println(factor(5));
	}
		
}
