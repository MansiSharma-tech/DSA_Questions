class ProfitableSchemes {
    public int profitableSchemes(int G, int P, int[] group, int[] profit) {
        final int MOD = 1000000007;
        int tasks = group.length;
        int[][][] dp = new int[tasks + 1][G + 1][P + 1];
        dp[0][0][0] = 1;

        for (int i = 1; i <= tasks; i++) {
            int g = group[i - 1];   
            int p = profit[i - 1];  
            for (int j = 0; j <= G; j++) {
                for (int k = 0; k <= P; k++) {
                    
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= g) {
                        
                        dp[i][j][k] = (dp[i][j][k] + dp[i - 1][j - g][Math.max(0, k - p)]) % MOD;
                    }
                }
            }
        }

        long rst = 0L;
        for (int i = 0; i <= G; i++) {
            rst = (rst + dp[tasks][i][P]) % MOD;
        }
        return (int)rst;
    }
}
