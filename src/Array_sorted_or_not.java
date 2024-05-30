public class Array_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5};
        int i = 0;
        System.out.println(isSorted(arr, i));
    }

    public static boolean isSorted(int[] arr, int i){
        if (i == arr.length - 1){
            return true;
        }
        if (arr[i] > arr[i + 1]){
            return false;
        }
        return isSorted(arr, i + 1);
    }
}
