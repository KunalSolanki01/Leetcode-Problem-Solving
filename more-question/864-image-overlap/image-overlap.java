class Solution {
    public int largestOverlap(int[][] a, int[][] b) {
        int n = a.length;
        List<int[]> x = new ArrayList<>();
        List<int[]> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    x.add(new int[] { i, j });
                }
                if (b[i][j] == 1) {
                    y.add(new int[] { i, j });
                }
            }
        }
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        for (int[] p : x) {
            for (int[] q : y) {
                int dx = q[0] - p[0];
                int dy = q[1] - p[1];
                String key = dx + "," + dy;
                int count = map.getOrDefault(key, 0) + 1;
                map.put(key, count);
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}