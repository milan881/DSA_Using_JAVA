//Print N to 1 using recursion
package rec;

public class sol2{
	/*
	public static void print(int n ) {
		int temp = n;
		if(temp <= 0) {
			return;
		}
		System.out.println(n);
		n--;
		print(n);
	}
	
	public static void main(String[] args) {
		print(7);
	}
	*/
	
	public static void print(int n , int count) {
			
		if(n<count) {
			return;
		}
		System.out.println(n);
		print(n-1, count);
	}
	
	public static void main(String[] args) {
		
		print(5, 1);
		
	}
}