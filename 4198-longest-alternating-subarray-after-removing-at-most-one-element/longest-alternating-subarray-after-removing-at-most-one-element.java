class Solution {
    public int longestAlternating(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return 1;
        }

        int[] L = new int[n];
        int[] R = new int[n];

        java.util.Arrays.fill(L, 1);
        java.util.Arrays.fill(R, 1);

        for (int i = 1; i < n; i++) {
            if (i == 1) {
                L[i] = (nums[i] != nums[i - 1]) ? 2 : 1;
            } else if ((nums[i] > nums[i - 1] && nums[i - 1] < nums[i - 2]) ||
                       (nums[i] < nums[i - 1] && nums[i - 1] > nums[i - 2])) {
                L[i] = L[i - 1] + 1;
            } else {
                L[i] = (nums[i] != nums[i - 1]) ? 2 : 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (i == n - 2) {
                R[i] = (nums[i] != nums[i + 1]) ? 2 : 1;
            } else if ((nums[i] < nums[i + 1] && nums[i + 1] > nums[i + 2]) ||
                       (nums[i] > nums[i + 1] && nums[i + 1] < nums[i + 2])) {
                R[i] = R[i + 1] + 1;
            } else {
                R[i] = (nums[i] != nums[i + 1]) ? 2 : 1;
            }
        }

        int res = Math.max(
            java.util.Arrays.stream(L).max().getAsInt(),
            java.util.Arrays.stream(R).max().getAsInt()
        );

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res = Math.max(res, R[1]);
            } else if (i == n - 1) {
                res = Math.max(res, L[n - 2]);
            } else {
                int lv = L[i - 1];
                int rv = R[i + 1];

                int d2 = Integer.compare(nums[i + 1], nums[i - 1]);

                if (d2 != 0) {
                    int d1 = (lv > 1)
                            ? Integer.compare(nums[i - 1], nums[i - 2])
                            : 0;

                    int d3 = (rv > 1)
                            ? Integer.compare(nums[i + 2], nums[i + 1])
                            : 0;

                    if ((d1 == 0 || d1 != d2) &&
                        (d3 == 0 || d2 != d3)) {

                        res = Math.max(res, lv + rv);

                    } else if (d1 == 0 || d1 != d2) {

                        res = Math.max(res, lv + 1);

                    } else if (d3 == 0 || d2 != d3) {

                        res = Math.max(res, rv + 1);
                    }
                }

                res = Math.max(res, Math.max(lv, rv));
            }
        }

        return res;
    }
}