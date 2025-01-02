package pattern;

public class P14 {

public static void main(String[] args) {
	nLetterTriangle(5);
}
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i =1;i<=n;i++){
            for(char j = 'A';j< 'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
