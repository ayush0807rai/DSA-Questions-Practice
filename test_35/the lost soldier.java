public class ques_2 {
    public static int lostSoldier(int n, int[] arr) {
        int sum = n * (n + 1) / 2;
        int actual = 0;
        for (int x : arr)
            actual += x;
        return sum - actual;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5};
        System.out.println(lostSoldier(5, arr));
    }
}
