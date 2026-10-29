class Solution {
    public int coinChange(int[] coins, int am) {
        int n = coins.length;
        int max = Integer.MAX_VALUE-1;
        int [][]dp = new int[n][am+1];
        for(int i=0;i<=am;i++){
            if(i%coins[0]==0) dp[0][i] = i/coins[0];
            else dp[0][i] = max;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=am;j++){
                int notTake = dp[i - 1][j];
                int take = max;
                if (coins[i]<=j) {
                    take = 1 + dp[i][j-coins[i]];
                }
                dp[i][j] = Math.min(take, notTake);
            }
        }
        int ans = dp[n - 1][am];
        return ans >= max ? -1 : ans;
    }
}