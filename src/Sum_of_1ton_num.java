public class Sum_of_1ton_num {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfN(n));
    }

    public static int sumOfN(int n){
        if (n == 1){
            return 1;
        }
        return n + sumOfN(n - 1);
    }
}
