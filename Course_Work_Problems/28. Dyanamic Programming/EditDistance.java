//  Problem Statement:
//  Given two strings, determine the minimum number of operations required to convert one string into the other. The allowed operations are:
//      1. Insertion of a character
//      2. Deletion of a character
//      3. Replacement of a character
//  Implement a function that calculates this minimum edit distance using dynamic programming.

public class EditDistance {
    public static int editDist(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int add = dp[i][j - 1];
                    int del = dp[i - 1][j];
                    int rep = dp[i - 1][j - 1];
                    dp[i][j] = Math.min(add, Math.min(del, rep)) + 1;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";

        System.out.println(editDist(word1, word2));
    }
}