public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 5};
        System.out.println(findLastOccurrence(arr, 5, arr.length -1));
    }
    private static int findLastOccurrence(int[] array, int element, int index) {

        if (index < 0) {
            return -1;
        }

        if (array[index] == element) {
            return index;
        }

        return findLastOccurrence(array, element, index - 1);
    }

}
