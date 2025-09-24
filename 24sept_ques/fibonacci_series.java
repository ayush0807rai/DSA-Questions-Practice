class Solution {
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 5;
        System.out.println("Factorial of " + num + " = " + sol.factorial(num));
    }
}
