class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, count = 0, max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
            while (count > k) {
                if (nums[l] == 0)
                    count--;
                l++;
            }
            max = Math.max(max, i - l + 1);
        }
        return max;
    }
}