class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        return Math.max(solve(nums, 0, n - 2),solve(nums, 1, n - 1));
    }

    public int solve(int[] nums, int start, int end) {
        int a = 0;
        int b = 0;
        for (int i = start; i <= end; i++) {
            int ans = nums[i] + a;
            int not = b;
            int curr = Math.max(ans,not);
            a = b;
            b = curr;
        }
        return b;
    }
}