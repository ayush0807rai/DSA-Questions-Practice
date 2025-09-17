import java.util.Scanner;

public class MirrorMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int N = sc.nextInt(); // rows
        int M = sc.nextInt(); // columns

        
        int[][] matrix = new int[N][M];

        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < N; i++) {
            for (int j = M - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
