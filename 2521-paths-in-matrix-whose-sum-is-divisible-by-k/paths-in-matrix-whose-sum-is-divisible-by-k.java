class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int MOD = 1000000007;
        int m = grid.length, n = grid[0].length;
        
        // dp[j][mod] = number of ways to reach column j with sum % k == mod
        int[][] dp = new int[n][k];
        dp[0][grid[0][0] % k] = 1;
        
        for (int i = 0; i < m; i++) {
            int[][] newDp = new int[n][k];
            for (int j = 0; j < n; j++) {
                for (int mod = 0; mod < k; mod++) {
                    int val = grid[i][j];
                    if (i > 0) {
                        int newMod = (mod + val) % k;
                        newDp[j][newMod] = (newDp[j][newMod] + dp[j][mod]) % MOD;
                    }
                    if (j > 0) {
                        int newMod = (mod + val) % k;
                        newDp[j][newMod] = (newDp[j][newMod] + newDp[j-1][mod]) % MOD;
                    }
                }
                // base case for first row and first column
                if (i == 0 && j == 0) newDp[0][grid[0][0] % k] = 1;
            }
            dp = newDp;
        }
        
        return dp[n-1][0]; // divisible by k
    }
}
