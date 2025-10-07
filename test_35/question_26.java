public class Q26 {
    public static void main(String[] args){
        int[][] mat={{10,20,30},{40,50,60},{70,80,90}}; int t=60, x=-1, y=-1;
        for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat[0].length;j++)
                if(mat[i][j]==t){x=i;y=j;}
        System.out.println("("+x+","+y+")");
    }
}
