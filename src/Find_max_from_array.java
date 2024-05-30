public class Find_max_from_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 4, 5};
        int max = Integer.MIN_VALUE;
        System.out.println(findMax(arr, arr.length - 1, max));
    }

    public static int findMax(int[] arr, int i, int max) {
        if (i == -1) {
            return max;
        }
        if (arr[i] > max) {
            max = arr[i];
        }
        return findMax(arr, i - 1, max);
    }
}
