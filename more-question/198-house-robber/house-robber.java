class Solution {
    public int help(int []nums,int idx,int []dp){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int ans = nums[idx] + help(nums,idx+2,dp);
        int not = help(nums,idx+1,dp);
        dp[idx] = Math.max(ans,not);
        return Math.max(ans,not);
    }
    public int rob(int[] nums) {
        int []dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return help(nums,0,dp);
    }
}