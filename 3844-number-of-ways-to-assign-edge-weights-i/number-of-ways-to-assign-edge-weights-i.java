class Solution {
    private List<Integer>[] g;
    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;
        g = new List[n + 1];
        Arrays.setAll(g, k -> new ArrayList<>());
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        return (int) pow(2, dfs(1, 0) - 1, 1_000_000_007);
    }
    private int dfs(int u, int p) {
        int max = 0;
        for (int v : g[u]) {
            if (v != p) {
                max = Math.max(max, dfs(v, u) + 1);
            }
        }
        return max;
    }
    private long pow(long b, int e, int m) {
        long res = 1;
        while (e > 0) {
            if ((e & 1) == 1) res = (res * b) % m;
            b = (b * b) % m;
            e >>= 1;
        }
        return res;
    }
}