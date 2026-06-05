class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int l = 1, h = Integer.MAX_VALUE;
        if ((long)m * k > n)
            return -1;
        int ans = -1;
        while (l <= h) {
            int day = l + (h - l) / 2;
            int count = 0;
            int bq = 0;
            for (int i = 0; i < n; i++) {
                if (bloomDay[i] <= day) {
                    count++;
                    if (count == k) {
                        bq++;
                        count = 0;
                    }
                }
                else{
                    count = 0;
                }
            }
            if (bq >= m) {
                h = day - 1;
                ans = day;
            } else {
                l = day + 1;
            }
        }
        return ans;
    }
}