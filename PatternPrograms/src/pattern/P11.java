package pattern;

public class P11 {

    public static void main(String[] args) {
        nBinaryTriangle(3);
    }


    public static void nBinaryTriangle(int n) {
        // Write your code here.
    int start;

        for(int i = 0;i<n;i++){
            if(i%2 == 0){
                 start = 1;
            }
            else
                 start = 0;

            for(int j =0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();

        }


    }
}