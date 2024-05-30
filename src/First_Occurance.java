public class First_Occurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 5};
        int i = 0, key = 5;
        System.out.println(firstO(arr, i, key));
    }

    public static int firstO(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstO(arr, i + 1, key);
    }
}
