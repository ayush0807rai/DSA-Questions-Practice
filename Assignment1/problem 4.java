import java.util.Scanner;

public class MatriciaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];
        int val = 1;

        
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = val++;

        int[][] result = new int[N][N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean isPattern = false;
                if (ch == 'Z') {
                    if (i == 0 || i == N - 1 || j == N - 1 - i) isPattern = true;
                } else if (ch == 'D') {
                    if (j == 0 || i == j || j == N - 1) isPattern = true;
                } else if (ch == 'A') {
                    if (i == 0 || i == j || j == 0 || j == N - 1) isPattern = true;
                } else if (ch == 'X') {
                    if (i == j || j == N - 1 - i) isPattern = true;
                }

                if (isPattern) {
                    result[i][j] = matrix[i][j];
                    sum += matrix[i][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }

        System.out.println(sum);
    }
}
