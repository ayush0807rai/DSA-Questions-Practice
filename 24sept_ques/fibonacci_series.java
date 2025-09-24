import java.util.Scanner;

public class Solution {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}
