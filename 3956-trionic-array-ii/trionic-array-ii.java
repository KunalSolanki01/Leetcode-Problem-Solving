class Solution {
    public long maxSumTrionic(int[] nums) {
        int n = nums.length;
        long res = Long.MIN_VALUE;
        int left = 0;
        int p = 0;
        int q = 0;
        long prefix = nums[0];
        for (int right = 1; right < n; right++) {
            prefix += nums[right];
            if (nums[right - 1] > nums[right]) {
                if (right - 2 >= 0 && nums[right - 2] < nums[right - 1]) {
                    p = right - 1;
                    while (left < q || (nums[left] < 0 && left + 1 < p)) {
                        prefix -= nums[left];
                        left++;
                    }
                }
            } else if (nums[right - 1] < nums[right]) {
                if (right - 2 >= 0 && nums[right - 2] > nums[right - 1]) {
                    q = right - 1;
                }
                if (left != p) {
                    res = Math.max(res, prefix);
                }
            } else {
                left = p = q = right;
                prefix = nums[right];
            }
        }
        return res;
    }
}