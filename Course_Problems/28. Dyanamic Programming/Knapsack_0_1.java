public class Knapsack_0_1 {
    public static int knapsack(int[] val, int[] wt, int w, int n) { // without DP
        if (w == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= w) {
            int ans1 = val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1);
            int ans2 = knapsack(val, wt, w, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return knapsack(val, wt, w, n - 1);
        }
    }

    public static int knapsackMemo(int[] val, int[] wt, int w, int n, int[][] dp) { // with Dyanamic Programming
                                                                                    // Recursion (Memoization)
        if (w == 0 || n == 0) {
            return 0;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (wt[n - 1] <= w) {
            int ans1 = val[n - 1] + knapsackMemo(val, wt, w - wt[n - 1], n - 1, dp);
            int ans2 = knapsackMemo(val, wt, w, n - 1, dp);
            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];
        } else {
            dp[n][w] = knapsackMemo(val, wt, w, n - 1, dp);
            return dp[n][w];
        }
    }

    public static void ArrayCreater(int[] val, int[] wt, int w, int n, int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
    }

    public static int knapsackTabu(int[] val, int[] wt, int w) { // with Dyanamic Programming iteration (Tabulation)
        int n = val.length;
        int[][] dp = new int[n + 1][w + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                int value = val[i - 1]; // ith item value
                int weight = wt[i - 1]; // ith item weight
                if (weight <= j) { // valid
                    int incProfit = value + dp[i - 1][j - weight]; // include
                    int excProfit = dp[i - 1][j]; // exclude
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) { // print array
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        int[] val = { 15, 14, 10, 45, 30 };
        int[] wt = { 2, 5, 1, 3, 4 };
        int w = 7;

        System.out
                .println("without DP (Only Recursion)     : " + knapsack(val, wt, w, val.length) + "  --> TC: O(2^n)");

        int[][] dp = new int[val.length + 1][w + 1];
        ArrayCreater(val, wt, w, val.length, dp);
        System.out.println(
                "with DP Recursion (Memoization) : " + knapsackMemo(val, wt, w, val.length, dp) + "  --> TC: O(n)");

        System.out.println("With DP Iteration (Tabulation)  : " + knapsackTabu(val, wt, w) + "  --> TC: O(n)");

    }
}
