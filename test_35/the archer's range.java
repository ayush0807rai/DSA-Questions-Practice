public class ques_19 {
    public static void main(String[] args){
        int[] arr={1,2,2,2,3}; int key=2, idx=-1;
        for(int i=0;i<arr.length;i++) if(arr[i]==key){idx=i; break;}
        System.out.println(idx);
    }
}
