public class FibonacciOnlyRecursion {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        int[] series = new int[n + 1];

        series[1] = 1;
        for (int i = 2; i <= n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}
