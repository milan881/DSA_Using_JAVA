package basic_maths;

public class ReverseInteger {

    public static void reverse(int x) {
        int m = 0;
        int rev = 0;
        while(x != 0) {
            m = x % 10;
            rev = (rev * 10) + m;
            x = x / 10;
        }
        System.out.println(rev);
    } 

    public static void main(String[] args) {
        reverse(785);  
    }
}