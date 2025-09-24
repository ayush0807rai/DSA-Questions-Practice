import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long sum = (long)Math.pow(2, n + 1) - 1;
        System.out.println("Sum of series = " + sum);
    }
}

