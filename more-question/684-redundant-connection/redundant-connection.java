class DSU {
    int n;
    int[] par;
    int[] size;
    DSU(int n) {
        this.n = n;
        par = new int[n + 1];
        size = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            par[i] = i;
            size[i] = 1;
        }
    }
    int find(int x) {
        if (par[x] == x) return x;
        return par[x] = find(par[x]);
    }
    boolean union(int x, int y) {
        int a = find(x);
        int b = find(y);
        if (a == b) return false;
        if (size[a] < size[b]) {
            int temp = a;
            a = b;
            b = temp;
        }
        par[b] = a;
        size[a] += size[b];
        return true;
    }
}
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        DSU d = new DSU(n);
        for (int i = 0; i < n; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            if (!d.union(u, v)) {
                return new int[] {u, v};
            }
        }
        return new int[] {};
    }
}