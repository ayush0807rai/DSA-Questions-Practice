import java.util.Arrays;

public class Q4 {
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
