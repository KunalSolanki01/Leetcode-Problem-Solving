class Solution {
    int[] dp;
    int helper(int idx,int[] nums){
        if (dp[idx] != -1) return dp[idx];
        int ans = 1;
        for (int i = idx + 1; i < nums.length; i++) {
            if (nums[i] > nums[idx]) {
                ans = Math.max(ans, 1 + helper(i, nums));
            }
        }
        return dp[idx] = ans;
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, helper(i, nums));
        }
        return ans;
    }
}