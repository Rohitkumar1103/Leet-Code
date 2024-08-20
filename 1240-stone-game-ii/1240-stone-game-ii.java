class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n + 1][n + 1];
        int[] suffixSum = new int[n + 1];
        
        // Calculate suffix sums
        for (int i = n - 1; i >= 0; --i) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }

        // Fill DP table
        for (int i = n - 1; i >= 0; --i) {
            for (int M = 1; M <= n; ++M) {
                for (int X = 1; X <= 2 * M && i + X <= n; ++X) {
                    dp[i][M] = Math.max(dp[i][M], suffixSum[i] - dp[i + X][Math.max(M, X)]);
                }
            }
        }

        return dp[0][1];
    }
}