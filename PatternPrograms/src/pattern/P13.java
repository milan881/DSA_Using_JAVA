package pattern;

public class P13{

    public static void main(String[] args) {
        nNumberTriangle(5);
    }

    public static void nNumberTriangle(int n) {
        // Write your code here

        int k =1;

        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(k+" ");    
                k++;
            }
            System.out.println(" ");
        }

    }
}