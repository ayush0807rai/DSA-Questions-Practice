import java.util.Scanner;

public class p2_23assign {
    
    public static void printEcho(int n) {
        
        if (n == 0) {
            return;
        }
        
        System.out.print(n + " ");
        
        printEcho(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printEcho(n);  
    }
}
