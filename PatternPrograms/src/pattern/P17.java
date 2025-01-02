package pattern;

public class P17 {

    public static void alphaHill(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // Print characters in a hill pattern
            char ch = 'A';
            int flag = (2 * i + 1) / 2;
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(ch+" ");
                if (k < flag) {
                    ch++;
                } else {
                    ch--;
                }
            }
            
            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alphaHill(5); // Test with n = 5
    }
}
