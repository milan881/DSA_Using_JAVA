package pattern;

public class P8 {
    public static void nStarTriangle(int n) {
        // Write your code here

        for(int i =0;i<n;i++){

            //space
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            for(int k =0 ;k<2*(n-i)-1;k++){
                System.out.print("*");
            }
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("");

        }
    }

        public static void main(String [] args){
            nStarTriangle(3);
        }

}