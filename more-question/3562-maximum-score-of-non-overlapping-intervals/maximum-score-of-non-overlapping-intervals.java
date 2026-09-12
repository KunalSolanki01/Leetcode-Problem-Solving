class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int[][] items = new int[n][4];
        for (int i = 0; i < n; i++) {
            items[i][0] = intervals.get(i).get(0);
            items[i][1] = intervals.get(i).get(1);
            items[i][2] = intervals.get(i).get(2);
            items[i][3] = i;
        }
        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));
        int[] starts = new int[n];
        for (int i = 0; i < n; i++) starts[i] = items[i][0];
        int[] nxt = new int[n];
        for (int i = 0; i < n; i++) {
            int lo = i + 1, hi = n, r = items[i][1];
            while (lo < hi) {
                int mid = (lo + hi) >>> 1;
                if (starts[mid] > r) hi = mid;
                else lo = mid + 1;
            }
            nxt[i] = lo;
        }
        long[][] dpW = new long[n + 1][5];
        List<Integer>[][] dpT = new List[n + 1][5];
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k < 5; k++) dpT[i][k] = new ArrayList<>();
        }
        for (int i = n - 1; i >= 0; i--) {
            int orig = items[i][3];
            long w = items[i][2];
            int ni = nxt[i];
            for (int k = 1; k <= 4; k++) {
                long skipW = dpW[i + 1][k];
                List<Integer> skipT = dpT[i + 1][k];
                long takeW = w + dpW[ni][k - 1];
                List<Integer> takeT = new ArrayList<>(dpT[ni][k - 1]);
                takeT.add(orig);
                Collections.sort(takeT);
                boolean smaller = false;
                if (takeW!= skipW) {
                    smaller = takeW > skipW;
                } else {
                    int m = Math.min(takeT.size(), skipT.size());
                    int idx = 0;
                    while (idx < m && takeT.get(idx).equals(skipT.get(idx))) idx++;
                    if (idx == m) smaller = takeT.size() < skipT.size();
                    else smaller = takeT.get(idx) < skipT.get(idx);
                }
                if (smaller) {
                    dpW[i][k] = takeW;
                    dpT[i][k] = takeT;
                } else {
                    dpW[i][k] = skipW;
                    dpT[i][k] = skipT;
                }
            }
        }
        List<Integer> ans = dpT[0][4];
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) res[i] = ans.get(i);
        return res;
    }
}