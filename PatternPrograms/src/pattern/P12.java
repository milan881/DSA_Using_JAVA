package pattern;

public class P12 {


	public static void main(String[] args) {
		numberCrown(2);	
	}

	
	public static void numberCrown(int n) {
        // Write your code here.

		for(int i =1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			for(int j =0;j<=(2*n)-(i*2);j++){
				System.out.print("  ");
			}

			 for (int k = i; k >= 1; k--) {
                System.out.print(k+" ");
            }

			System.out.println();
		}

    }
}