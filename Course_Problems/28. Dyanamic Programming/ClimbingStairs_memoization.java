import java.util.Arrays;

public class ClimbingStairs_memoization { // 1 or 2 jumps allowed
    public static int ways(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return waysHelper(n, dp);
    }

    public static int waysHelper(int n, int[] dp) { // helper function
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];

        dp[n] = waysHelper(n - 1, dp) + waysHelper(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 7; // n=3->3 & n=4->5 -> 3 + 5 = 8
        System.out.println(ways(n));
    }
}