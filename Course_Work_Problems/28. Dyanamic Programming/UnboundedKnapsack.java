public class UnboundedKnapsack {
    public static int unboundKnapsack(int[] val, int[] wt, int w) { // Tabulation
        int n = val.length;
        int dp[][] = new int[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) { // no need of this iterations loop in java (already 0)
            dp[i][0] = 0;
        }
        for (int j = 0; j < w + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (wt[i - 1] <= j) { // valid
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else { // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[n][w];
    }

    public static void main(String[] args) {
        int[] val = { 15, 14, 10, 45, 30 }; // items price
        int[] wt = { 2, 5, 1, 3, 4 }; // items cost
        int w = 7; // bag capacity

        System.out.println(unboundKnapsack(val, wt, w));
    }
}
