// Problem Statement:- Count ways to reach the N'th stair, The person can climb either 1 stair or 2 stairs at a time.
// Time Compexity: O(n)     Space Compaxity: O(n)

import java.util.Arrays;

public class ClimbingStairs_Memoization { // Memoization (recursive) DP
    public static int memo(int n, int[] dp) {
        if (n == 0 || n == 1)
            return 1;
        if (n < 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];

        dp[n] = memo(n - 1, dp) + memo(n - 2, dp);
        return dp[n];
    }

    public static int findWays(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return memo(n, dp);
    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println(findWays(n));
    }
}