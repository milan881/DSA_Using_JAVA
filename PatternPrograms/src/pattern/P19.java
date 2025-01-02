package pattern;

public class P19 {

    public static void main(String[] args) {
        symmetry(5);
    }


    public static void symmetry(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j =0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();

            for(int j =0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}