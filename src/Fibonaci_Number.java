public class Fibonaci_Number {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));

    }
    public static int fib(int n) {
        if (n <= 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
