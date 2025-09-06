public class XPow_n {
    public static int x_pow_n(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * x_pow_n(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(x_pow_n(x, n));

    }
}
