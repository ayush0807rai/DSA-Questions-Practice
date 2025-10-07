public class Q25 {
    public static void main(String[] args){
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}}; int t=5, found=0;
        for(int[] row:mat) for(int x:row) if(x==t) found=1;
        System.out.println(found==1?"Yes":"No");
    }
}
