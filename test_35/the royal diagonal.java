import java.util.Scanner;
public class ques_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), m=in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j]=in.nextInt();
        int d1=0, d2=0;
        for(int i=0;i<n;i++) d1+=arr[i][i];
        for(int i=0;i<n;i++) d2+=arr[i][n-1-i];
        System.out.println(d1+" "+d2);
    }
}
