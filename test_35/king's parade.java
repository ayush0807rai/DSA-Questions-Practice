public class ques_5 {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1])
                return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {3, 2, 1};
        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2)); 
    }
}
