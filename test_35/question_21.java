public class Q21 {
    public static void main(String[] args){
        int[] arr={1,2,4,6,6,8}; int t=6;
        int l=0, r=arr.length;
        while(l<r){
            int m=(l+r)/2;
            if(arr[m]<t) l=m+1;
            else r=m;
        }
        System.out.println(l<arr.length?l:arr.length);
    }
}
