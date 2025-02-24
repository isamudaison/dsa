package org.creft.data.algorithm.game;

public class VankinsMile {
    public static int maxScoreVankinsMile(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];

        dp[0][0] = grid[0][0];

        // Fill first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Fill the rest of the table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[n - 1][n - 1];
    }
}
