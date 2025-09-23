import java.util.Scanner;

public class p4_23assign {
    public static String reverseString(String s) {
        
        if (s.length() <= 1) {
            return s;
        }
        
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverseString(s));
    }
}
