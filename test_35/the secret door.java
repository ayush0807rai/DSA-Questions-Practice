public class ques_18 {
    public static void main(String[] args){
        int[] arr={1,3,5,7,9}; int key=7,l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){ans=mid; break;}
            else if(arr[mid]<key) l=mid+1;
            else r=mid-1;
        }
        System.out.println(ans);
    }
}
