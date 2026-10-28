class Solution {
    int dp[];
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans1 = solve(nums, 0, n - 2);
        Arrays.fill(dp,-1);
        int ans2 = solve(nums, 1, n - 1);
        return Math.max(ans1,ans2);
    }
    public int solve(int[] nums, int start, int end) {
        if(start>end) return 0;
        if(dp[start]!=-1) return dp[start];
        int rob = nums[start] + solve(nums,start+2,end);
        int not = solve(nums,start+1,end);
        return dp[start] = Math.max(rob,not);
    }
}