class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long MOD = 1_000_000_007L;
        int[] cnt = new int[30];
        for (int x : nums) {
            long p = 1;
            for (int i = 0; i < 30; i++) {
                if ((x / p) % 2 == 1) {
                    cnt[i]++;
                }
                p *= 2;
            }
        }
        long ans = 0;
        for (int i = 0; i < k; i++) {
            long x = 0;
            long p = 1;
            for (int j= 0; j< 30; j++) {
                if (cnt[j] > 0) {
                    x += p;
                    cnt[j]--;
                }
                p *= 2;
            }
            ans = (ans + x * x) % MOD;
        }
        return (int) ans;
    }
}