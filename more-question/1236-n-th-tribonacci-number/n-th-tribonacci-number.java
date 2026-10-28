class Solution {
    int dp[];
    public int tribonacci(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n);
    }
    int helper(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        dp[0] = 0;
        dp[1] = dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}