public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 5};
        System.out.println(lastOccurence(arr,arr.length - 1, 5));
    }

    public static int lastOccurence(int[] arr, int i, int key) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return lastOccurence(arr, i - 1, key);
    }
}
