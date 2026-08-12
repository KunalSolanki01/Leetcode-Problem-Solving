class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        int l = 0;
        int ans = 0;

        for (int r = 0; r < nums.length; r++) {
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);

            while (freq.get(nums[r]) > k) {
                freq.put(nums[l], freq.get(nums[l]) - 1);
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}