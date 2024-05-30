public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fatorial(n));

    }

    public static int fatorial(int n) {
        if (n == 1) {
            return 1;
        }
       return n * fatorial(n - 1);
    }
}
