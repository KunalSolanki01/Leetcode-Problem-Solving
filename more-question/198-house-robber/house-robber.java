class Solution {
    public int help(int []nums,int idx,int []dp){
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        dp[1] = nums[0];
        dp[2] = Math.max(nums[0],nums[1]);
        for(int i=idx;i<=n;i++){
            int ans = nums[i-1]+dp[i-2];
            int not = dp[i-1];
            dp[i] = Math.max(ans,not);
        }
        return dp[n];
    }
    public int rob(int[] nums) {
        int []dp = new int[nums.length+1];
        return help(nums,3,dp);
    }
}