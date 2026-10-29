class Solution {
    public int change(int am, int[] coins) {
        int[] dp = new int[am+1];
        dp[0] = 1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=am;j++){
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[am];
    }
}