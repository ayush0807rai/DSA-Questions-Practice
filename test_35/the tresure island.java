import java.util.Scanner;
public class ques_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), m=in.nextInt();
        int[] a = new int[n*m];
        for(int i=0;i<n*m;i++) a[i]=in.nextInt();
        int row=0, max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++) sum+=a[i*m+j];
            if(sum>max){ max=sum; row=i;}
        }
        System.out.println("Row "+row+" (sum="+max+")");
    }
}
