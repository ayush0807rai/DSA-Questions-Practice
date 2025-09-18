import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();

        
        int[][] matrix = new int[N][N];

        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        
        for (int i = 0; i < N; i++) {
            mainDiagonalSum += matrix[i][i];             
            secondaryDiagonalSum += matrix[i][N - 1 - i]; 
        }

        
        System.out.println(mainDiagonalSum + " " + secondaryDiagonalSum);
    }

}
