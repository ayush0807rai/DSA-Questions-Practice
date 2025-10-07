public class ques_17 {
    public static void main(String[] args){
        int[] arr={10,20,30};
        int key=25, idx=-1;
        for(int i=0;i<arr.length;i++) if(arr[i]==key) idx=i;
        System.out.println(idx);
    }
}
