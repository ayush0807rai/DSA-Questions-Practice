public class ques_11 {
    static int hanoi(int n){
        if(n==1) return 1;
        return 2*hanoi(n-1)+1;
    }
    public static void main(String[] args){
        System.out.println(hanoi(3));
    }
}
