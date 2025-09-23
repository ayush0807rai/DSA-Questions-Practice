import java.util.Scanner;

public class p6_23assign {
    public static int climbWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbWays(n - 1) + climbWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(climbWays(n));
    }
}
