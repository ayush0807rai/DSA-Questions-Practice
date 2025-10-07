public class Q24 {
    public static void main(String[] args){
        int[] arr={1,2,4,6,6,8}; int t=5,ans=-1;
        for(int i=arr.length-1;i>=0;i--) if(arr[i]<=t){ans=arr[i]; break;}
        System.out.println(ans);
    }
}
