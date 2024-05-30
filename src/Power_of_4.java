public class Power_of_4 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        } else if(n % 4 == 0){
            return isPowerOfFour(n / 4);
        } else if(n == 1){
            return true;
        }

        return false;
    }
}
