package rec;
//Print 1 To N Without Loop
public class Sol {
	
	static int count = 0;
	static int i = 1;
	public static void print(int n) {
		
		
		if(count == 5) {
			return;
		} 
			System.out.println(i);
			i++;
			count++;
			print(n);
	}
	
	public static void main(String[] args) {

		print(6);
		
	}
}
