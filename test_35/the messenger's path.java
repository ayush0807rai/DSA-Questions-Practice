import java.util.*;
public class ques_9 {
    static boolean dfs(int[][] arr,int x,int y,boolean[][] vis){
        if(x<0||y<0||x>=arr.length||y>=arr[0].length||arr[x][y]==1||vis[x][y]) return false;
        if(x==arr.length-1 && y==arr[0].length-1) return true;
        vis[x][y]=true;
        return dfs(arr,x+1,y,vis)||dfs(arr,x-1,y,vis)||dfs(arr,x,y+1,vis)||dfs(arr,x,y-1,vis);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), m=in.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j]=in.nextInt();
        boolean[][] vis=new boolean[n][m];
        System.out.println(dfs(arr,0,0,vis));
    }
}
