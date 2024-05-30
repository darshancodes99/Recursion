public class Print_array_element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 ,5};
        printEle(arr, arr.length -1);
    }
    public static void printEle(int[] arr, int i){
        if (i == -1){
            return;
        }
        printEle(arr, i - 1);
        System.out.print(arr[i] + " ");
    }
}
