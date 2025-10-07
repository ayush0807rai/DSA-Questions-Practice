public class Q23 {
    public static void main(String[] args){
        int[] arr={1,2,4,6,6,8}; int t=5,ans=-1;
        for(int x:arr) if(x>=t){ans=x; break;}
        System.out.println(ans);
    }
}
