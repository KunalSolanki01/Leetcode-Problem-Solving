class Solution {
    private static final int MOD = 1_000_000_007, LOG = 17;
    public int[] assignEdgeWeights(int[][] e, int[][] q) {
        int n = e.length + 1, m = q.length;
        int[] res = new int[m], d = new int[n + 1];
        int[][] p = new int[LOG][n + 1];
        List<Integer>[] g = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) g[i] = new ArrayList<>();
        for (int[] edge : e) { g[edge[0]].add(edge[1]); g[edge[1]].add(edge[0]); }
        dfs(1, -1, g, p, d);
        for (int k = 1; k < LOG; k++)
            for (int i = 1; i <= n; i++)
                if (p[k - 1][i] != -1) p[k][i] = p[k - 1][p[k - 1][i]];
        for (int i = 0; i < m; i++) {
            int u = q[i][0], v = q[i][1];
            if (u == v) res[i] = 0;
            else {
                int a = lca(u, v, p, d);
                res[i] = modPow(2, d[u] + d[v] - 2 * d[a] - 1);
            }
        }
        return res;
    }
    private void dfs(int u, int par, List<Integer>[] g, int[][] p, int[] d) {
        p[0][u] = par;
        for (int v : g[u]) if (v != par) { d[v] = d[u] + 1; dfs(v, u, g, p, d); }
    }
    private int lca(int u, int v, int[][] p, int[] d) {
        if (d[u] < d[v]) { int t = u; u = v; v = t; }
        for (int k = LOG - 1; k >= 0; k--) if (p[k][u] != -1 && d[p[k][u]] >= d[v]) u = p[k][u];
        if (u == v) return u;
        for (int k = LOG - 1; k >= 0; k--) if (p[k][u] != p[k][v]) { u = p[k][u]; v = p[k][v]; }
        return p[0][u];
    }
    private int modPow(long x, long n) {
        long res = 1;
        x %= MOD;
        while (n > 0) {
            if ((n & 1) == 1) res = res * x % MOD;
            x = x * x % MOD;
            n >>= 1;
        }
        return (int) res;
    }
}