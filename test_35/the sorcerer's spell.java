public class ques_13 {
    static String rev(String s){
        if(s.length()==0) return "";
        return rev(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args){
        System.out.println(rev("abc"));
    }
}
