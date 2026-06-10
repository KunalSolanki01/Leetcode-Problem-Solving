class SparseTableRMQ {
    int[][] fMax, fMin;
    int[] lg;

    public SparseTableRMQ(int[] a) {
        int n = a.length;
        int m = 32 - Integer.numberOfLeadingZeros(n) + 1;
        fMax = new int[n][m];
        fMin = new int[n][m];
        lg = new int[n + 1];
        for (int i = 2; i <= n; i++) lg[i] = lg[i / 2] + 1;
        for (int i = 0; i < n; i++) {
            fMax[i][0] = a[i];
            fMin[i][0] = a[i];
        }
        for (int j = 1; j < m; j++) {
            int p = (int) Math.pow(2, j - 1);
            for (int i = 0; i <= n - (p * 2); i++) {
                fMax[i][j] = Math.max(fMax[i][j - 1], fMax[i + p][j - 1]);
                fMin[i][j] = Math.min(fMin[i][j - 1], fMin[i + p][j - 1]);
            }
        }
    }

    public int qMax(int l, int r) {
        int k = lg[r - l + 1];
        int p = (int) Math.pow(2, k);
        return Math.max(fMax[l][k], fMax[r - p + 1][k]);
    }

    public int qMin(int l, int r) {
        int k = lg[r - l + 1];
        int p = (int) Math.pow(2, k);
        return Math.min(fMin[l][k], fMin[r - p + 1][k]);
    }
}

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        SparseTableRMQ st = new SparseTableRMQ(nums);
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));
        Set<String> vis = new HashSet<>();

        long init = (long) st.qMax(0, n - 1) - st.qMin(0, n - 1);
        pq.offer(new long[]{init, 0, n - 1});
        vis.add("0," + (n - 1));

        long ans = 0;
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            long[] cur = pq.poll();
            ans += cur[0];
            int l = (int) cur[1];
            int r = (int) cur[2];

            if (l < r) {
                String k1 = (l + 1) + "," + r;
                if (vis.add(k1)) {
                    pq.offer(new long[]{(long) st.qMax(l + 1, r) - st.qMin(l + 1, r), l + 1, r});
                }
                String k2 = l + "," + (r - 1);
                if (vis.add(k2)) {
                    pq.offer(new long[]{(long) st.qMax(l, r - 1) - st.qMin(l, r - 1), l, r - 1});
                }
            }
        }
        return ans;
    }
}