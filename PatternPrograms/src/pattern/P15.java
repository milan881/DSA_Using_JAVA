package pattern;

public class P15 {

public static void main(String[] args) {
    nLetterTriangle(5);
}

    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i =0;i<=n;i++){

        for(char j ='A';j<'A'+(n-i);j++){
            System.out.print(j+" ");
        }
        
        System.out.println("");
    }

}
}

