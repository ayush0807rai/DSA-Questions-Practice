public class ques_1 {
    public static int kingsFeast(int[] arr) {
        int max = arr[0];
        for (int x : arr)
            if (x > max)
                max = x;
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 9, 5};
        System.out.println(kingsFeast(arr));
    }
}
