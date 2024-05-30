public class Find_the_sum_of_digits {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(sumD(n, 0));
    }
    public static int sumD(int n ,int sum){
        if (n == 0){
            return sum;
        }
        int digit = n % 10;
        sum += digit;
        return sumD(n / 10, sum);
    }
}
