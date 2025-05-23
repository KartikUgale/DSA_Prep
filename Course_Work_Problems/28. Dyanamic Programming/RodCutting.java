// Problem :- return Maximum value obtainable by cutting the rod and selling the pieces.

public class RodCutting {
    public static int maxPrice(int[] length, int[] price, int rodLength) {
        int n = price.length;
        int[][] dp = new int[n + 1][rodLength + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < rodLength + 1; j++) {
                if (length[i - 1] <= j) { // valid
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else { // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < rodLength + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return dp[n][rodLength];
    }

    public static void main(String[] args) {
        int[] length = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int rodLength = 8;

        System.out.println(maxPrice(length, price, rodLength));
    }
}