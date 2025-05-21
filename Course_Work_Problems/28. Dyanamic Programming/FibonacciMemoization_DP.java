public class FibonacciMemoization_DP { // DP Type --> Memoization (Top Down) --(Recursion)
    public static int fib(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        return n = fib(n - 1, dp) + fib(n - 2, dp);
    }

    public static void main(String[] args) {
        int n = 3;

        int[] dp = new int[n + 1];
        System.out.println(fib(n, dp));
    }
}
