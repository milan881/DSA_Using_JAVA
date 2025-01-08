package basic_maths;

public class Armstrong {
	
	public static void arm(int x) {
		int temp = x;
		double sum = 0;
		int n = 0;
		int count = String.valueOf(x).length();
		while(temp != 0){
			n = temp % 10;
			sum = sum + Math.pow(n,count);
			temp = temp / 10;
		}

		if(sum == x) {
			System.out.println(x+" Is a Armstrong no");
		}
		else {
			System.out.println(x+ " Is not a Armstrong no");
		}
	}
	
	public static void main(String[] args) {
		
		arm(153);
		arm(9474);
		
	}

}
