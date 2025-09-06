public class LongestCommonSubString {
    public static int lcSubString(String str1, String str2) { // Tabulation DP
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];

        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(dp[i][j], ans);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABCE";

        System.out.println(lcSubString(str1, str2));
    }
}
