class Solution {
    public int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        System.out.println("Sum of squares = " + obj.sumOfSquares(n)); 
    }
}
