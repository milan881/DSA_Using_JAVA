package rec;
//Print 1 To N Without Loop
public class Sol {
	/*
	
	static int count = 0;
	static int i = 1;
	public static void print(int n) {
		
		if(count == n) {
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
<<<<<<< HEAD
	
	*/
/*	
	public static void print(int n , int count) {
		
		if(count > n) {
			return;
		}else {
			System.out.println(count);
			count++;
			print(n, count);
		}
	}
	
	public static void main(String[] args) {
		
		print(5, 1);
		
	}
*/
	
    public static void print(int n) {
        printTailRecursive(1, n);
    }

    private static void printTailRecursive(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        printTailRecursive(current + 1, n); 
    }

    public static void main(String[] args) {
        print(5); 
    }
}
