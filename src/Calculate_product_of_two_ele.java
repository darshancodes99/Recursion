public class Calculate_product_of_two_ele {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(product(a, b, 0));
    }

    public static int product(int a, int b, int ans) {
        if (b == 0) {
            return ans;
        }
        ans += a;
        b--;
        return product(a, b, ans);
    }
}
