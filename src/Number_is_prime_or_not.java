public class Number_is_prime_or_not {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n, n - 1));
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 1){
            return false;
        }

        if (i == 1){
            return true;
        } else if (n % i == 0) {
            return false;
        } else {
           return isPrime(n, i - 1);
        }
    }
}
