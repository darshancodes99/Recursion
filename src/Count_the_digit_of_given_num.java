public class Count_the_digit_of_given_num {
    public static void main(String[] args) {
        int n = 12345677;
        System.out.println(countD(n));
    }

    public static int countD(int n) {
        if (n == 0) {
            return n;
        }
        return 1 + countD(n / 10);
    }
}
