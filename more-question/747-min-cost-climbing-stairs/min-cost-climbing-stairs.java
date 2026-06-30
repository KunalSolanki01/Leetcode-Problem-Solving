class Solution {
    int[] dp;
    public int helper(int n, int[] cost){
        if(n>=cost.length) return 0;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = cost[n]+Math.min(helper(n+1,cost),helper(n+2,cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(helper(0,cost),helper(1,cost));
    }
}