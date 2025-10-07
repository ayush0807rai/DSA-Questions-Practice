public class Q29 {
    public static void main(String[] args){
        int[][] mat={{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        int t=6; int n=mat.length, m=mat[0].length, found=0;
        int i=0,j=m-1;
        while(i<n&&j>=0){
            if(mat[i][j]==t){found=1;break;}
            else if(mat[i][j]>t)j--;
            else i++;
        }
        System.out.println(found==1?"True":"False");
    }
}
