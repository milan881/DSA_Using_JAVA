package pattern;

public class P16{

    public static void main(String[] args) {
        alphaRamp(5);
    }

    public static void alphaRamp(int n) {
        // Loop through each level of the pattern
        for (int i = 0; i < n; i++) {
            // Determine the character to print
            char ch = (char) ('A' + i);
            // Print the character 'i' times
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            // Move to the next line after printing the character 'i' times
            System.out.println();
        }
    }
}