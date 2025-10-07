public class Q27 {
    public static void main(String[] args){
        int[][] mat={{1,3,5},{7,10,11},{16,20,30}}; int t=10, found=false;
        int n=mat.length, m=mat[0].length;
        int left=0,right=n*m-1;
        while(left<=right){
            int mid=(left+right)/2;
            int val=mat[mid/m][mid%m];
            if(val==t){found=true;break;}
            else if(val<t) left=mid+1;
            else right=mid-1;
        }
        System.out.println(found);
    }
}
