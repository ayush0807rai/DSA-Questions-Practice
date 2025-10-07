import java.util.*;
public class ques_10 {
    static void dfs(int[][] arr,int x,int y,boolean[][] vis){
        if(x<0||y<0||x>=arr.length||y>=arr[0].length||arr[x][y]==0||vis[x][y]) return;
        vis[x][y]=true;
        dfs(arr,x+1,y,vis); dfs(arr,x-1,y,vis); dfs(arr,x,y+1,vis); dfs(arr,x,y-1,vis);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(), m=in.nextInt();
        int[][] arr=new int[n][m]; for(int i=0;i<n;i++) for(int j=0;j<m;j++) arr[i][j]=in.nextInt();
        boolean[][] vis=new boolean[n][m];
        int ponds=0;
        for(int i=0;i<n;i++) for(int j=0;j<m;j++)
                if(arr[i][j]==1 && !vis[i][j]){dfs(arr,i,j,vis); ponds++;}
        System.out.println(ponds);
    }
}
