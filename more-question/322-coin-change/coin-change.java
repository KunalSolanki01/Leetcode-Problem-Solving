class Solution {
    int[][] dp;
    int max = Integer.MAX_VALUE-1;
    public int helper(int[] coins, int amount, int idx) {
        if (amount < 0) return max; 
        if (idx == 0) {
            if (amount % coins[0] == 0) return amount / coins[0];
            return max;
        }
        if (dp[idx][amount] != -1) return dp[idx][amount]; 
        int take = 1 + helper(coins, amount - coins[idx], idx);
        int notTake = helper(coins, amount, idx - 1);
        return dp[idx][amount] = Math.min(take, notTake);  
    }

    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length][amount+1];
        for(int[] x : dp) Arrays.fill(x,-1);
        Arrays.sort(coins);
        if (amount == 0) {
            return 0;
        }
        int ans = helper(coins, amount, coins.length - 1);
        if (ans >= max) {
            return -1;
        }
        return ans;
    }
}