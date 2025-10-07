public class ques_15 {
    static int arrSum(int[] arr,int i){
        if(i==arr.length) return 0;
        return arr[i]+arrSum(arr,i+1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(arrSum(arr,0));
    }
}
