// problem :- find all the ways to complete the sum by using coins

public class CoinChange_Unbounded {
    public static int ways(int[] coins, int sum) { // Tabulation
        int n = coins.length;
        int[][] dp = new int[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i - 1] <= j) { // valid
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else { // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 3 };
        int sum = 6;
        System.out.println(ways(coins, sum));
    }
}
