class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int ans1 = solve(nums, 0, n - 2);
        int ans2 = solve(nums, 1, n - 1);
        return Math.max(ans1, ans2);
    }

    public int solve(int[] nums, int start, int end) {
        int n = end - start + 1;
        int[] dp = new int[n + 2];
        for (int i = n - 1; i >= 0; i--) {
            int rob = nums[start + i] + dp[i + 2];
            int not = dp[i + 1];
            dp[i] = Math.max(rob, not);
        }
        return dp[0];
    }
}