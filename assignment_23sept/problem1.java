import java.util.Scanner;

public class p1_23assign {
    
    public static void printBeats(int current, int n) {
        
        if (current > n) {
            return;
        }
        
        System.out.print(current + " ");
        
        printBeats(current + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printBeats(1, n);  
    }
}
