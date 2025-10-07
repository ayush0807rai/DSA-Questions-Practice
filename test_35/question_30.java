public class Q30 {
    public static void main(String[] args){
        int[][] mat = {{1,2,8},{3,6,10},{7,9,12}};
        int t = 9;
        String res = "Failed";
        for(int[] row : mat)
            for(int x : row)
                if(x == t) res = "Activated";
        System.out.println(res);
    }
}
