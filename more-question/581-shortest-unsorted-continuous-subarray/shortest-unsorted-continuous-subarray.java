class Solution {
    public int helper(int[] nums) {
        int n = nums.length;
        int l = -1, r = -2;
        if (n == 1)
            return 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                r = i;
            }

            int j = n - 1 - i;
            min = Math.min(min, nums[j]);
            if (nums[j] > min) {
                l = j;
            }
        }
        return r-l+1;
    }

    public int findUnsortedSubarray(int[] nums) {
        return helper(nums);
    }
}