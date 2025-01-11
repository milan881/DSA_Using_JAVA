package rec;
//Sum of n no


public class Sum {
/*
	static int sum = 0;
	static int count = 1;
	
	public static void sum(int num) {
		
		
		if(count > num) {
			return;
		}
		sum = sum+count;
		
		count++;
		sum(num);
		
	}
	
	
	public static void main(String[] args) {
		sum(5);
		System.out.println(sum);
		
	}
*/
	
	public static void sum(int num, int count, int sum) {
		
		if(count > num) {
			return;
		}
		sum = sum+count;
		System.out.println(sum);
		count++;
		sum(num,count,sum);
		
	}
	
	public static void main(String[] args) {
		sum(5,1,0);
		
	}

}
