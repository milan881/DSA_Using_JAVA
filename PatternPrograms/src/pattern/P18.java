package pattern;

public class P18 {

public static void main(String[] args) {
    alphaTriangle(5);
}


    public static void alphaTriangle(int n) {
        // Write your code here
        char startChar = (char) ('A' + n - 1);
        for(int i =0;i<n;i++){
            char ch=startChar;
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
