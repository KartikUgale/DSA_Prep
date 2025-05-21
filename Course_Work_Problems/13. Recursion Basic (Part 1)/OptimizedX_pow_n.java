public class OptimizedX_pow_n {
    public static int xPow_nOptimized(int x, int n) {
        if (n == 1) {
            return x;
        }
        int halfPow = xPow_nOptimized(x, n / 2);
        int xPow = (int) Math.pow(halfPow, 2); // halfPow * halfPow
        if (n % 2 != 0) {
            return xPow * x;
        }
        return xPow;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(xPow_nOptimized(x, n));
    }
}
