public class ques_16 {
    public static void main(String[] args){
        int[] arr={2,5,7,8};
        int key=7;
        int idx=-1;
        for(int i=0;i<arr.length;i++) if(arr[i]==key) idx=i;
        System.out.println(idx);
    }
}
