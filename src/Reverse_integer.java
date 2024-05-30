public class Reverse_integer {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(reverse(n, 0));
    }

    public static int reverse(int n, int ans) {
        if (n == 0) {
            return ans;
        }
        int digit = n % 10;
        ans = (ans * 10) + digit;
        return reverse(n / 10, ans);
    }
}
