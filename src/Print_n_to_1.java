public class Print_n_to_1 {
    public static void main(String[] args) {
        int n = 10;
        PrintD(n);
        System.out.println();
        PrintIn(n);
    }
    public static void PrintD(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        PrintD(n - 1);
    }

    public static void PrintIn(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        PrintIn(n - 1);
        System.out.print(n + " ");
    }
}
