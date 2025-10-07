public class Q28 {
    public static void main(String[] args){
        int[][] mat={{1,2,2},{3,4,4},{5,6,7}}; int t=4, x=-1, y=-1;
        outer:for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat[0].length;j++)
                if(mat[i][j]==t){x=i;y=j;break outer;}
        System.out.println("("+x+","+y+")");
    }
}
