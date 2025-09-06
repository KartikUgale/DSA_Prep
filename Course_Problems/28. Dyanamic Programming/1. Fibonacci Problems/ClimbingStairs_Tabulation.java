// Problem Statement:- Count ways to reach the N'th stair, The person can climb either 1 stair or 2 stairs at a time.
// Time Compexity: O(n)     Space Compaxity: O(n)

public class ClimbingStairs_Tabulation {
    public static int findWaysByTabu(int n) { // Tabulation (Iterative) DP
        if (n == 0 || n == 1)
            return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(findWaysByTabu(n));
    }
}
