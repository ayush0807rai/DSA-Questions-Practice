import java.util.*;
public class ques_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), m=in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j]=in.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        int r1=0, r2=n-1, c1=0, c2=m-1;
        while(r1<=r2&&c1<=c2){
            for(int i=c1;i<=c2;i++) res.add(arr[r1][i]);
            for(int i=r1+1;i<=r2;i++) res.add(arr[i][c2]);
            if(r1!=r2) for(int i=c2-1;i>=c1;i--) res.add(arr[r2][i]);
            if(c1!=c2) for(int i=r2-1;i>r1;i--) res.add(arr[i][c1]);
            r1++;r2--;c1++;c2--;
        }
        System.out.println(res);
    }
}
