class Solution {
    int[][] dp;
    int helper(int idx,int prev, int[] nums){
        if(idx>=nums.length) return 0;
        if (dp[idx][prev + 1] != -1) {
            return dp[idx][prev + 1];
        }
        int take = 0;
        int not = helper(idx+1,prev,nums);
        if(prev==-1 || nums[idx]>nums[prev]){
            take = 1+helper(idx+1,idx,nums);
        }
        return dp[idx][prev+1] = Math.max(take,not);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n][n+1];
        for(int []x:dp) Arrays.fill(x,-1);
        return helper(0,-1,nums);
    }
}