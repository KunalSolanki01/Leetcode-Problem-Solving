class Solution {
    public int largestInteger(int[] nums, int k) {
         int n = nums.length;

        if (k == 1) {
            int[] freq = new int[51];

            for (int num : nums) {
                freq[num]++;
            }

            for (int num = 50; num >= 0; num--) {
                if (freq[num] == 1) {
                    return num;
                }
            }

            return -1;
        }

        if (k == n) {
            int ans = 0;

            for (int num : nums) {
                ans = Math.max(ans, num);
            }

            return ans;
        }

        int ans = -1;

        if (isUnique(nums, 0)) {
            ans = Math.max(ans, nums[0]);
        }

        if (isUnique(nums, n - 1)) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }

    public boolean isUnique(int[] nums, int index) {
        for (int i = 0; i < nums.length; i++) {
            if (i != index && nums[i] == nums[index]) {
                return false;
            }
        }
        return true;
    }
}