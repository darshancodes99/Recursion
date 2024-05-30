public class Natural_No {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(NaturalNumSum(n));
    }

    public static int NaturalNumSum(int n){
        if (n == 1){
            return n;
        }
        int sum1 = NaturalNumSum(n - 1);
        int sum = n + sum1;
        return sum;
    }
}
