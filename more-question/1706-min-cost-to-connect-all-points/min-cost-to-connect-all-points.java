class Solution {
    class DSU {
        int[] par;
        int[] size;
        DSU(int n) {
            par = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                par[i] = i;
                size[i] = 1;
            }
        }
        int find(int u) {
            if (par[u] == u) {
                return u;
            }
            return par[u] = find(par[u]);
        }
        void unionBySize(int u, int v) {
            int ultParU = find(u);
            int ultParV = find(v);
            if (ultParU == ultParV) {
                return;
            }
            if (size[ultParU] < size[ultParV]) {
                par[ultParU] = ultParV;
                size[ultParV] += size[ultParU];
            } else {
                par[ultParV] = ultParU;
                size[ultParU] += size[ultParV];
            }
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int xi = points[i][0];
            int yi = points[i][1];

            for (int j = i + 1; j < n; j++) {
                int xj = points[j][0];
                int yj = points[j][1];
                int distance = Math.abs(xi - xj) + Math.abs(yi - yj);
                edges.add(new int[]{i, j, distance});
            }
        }
        edges.sort((a, b) -> Integer.compare(a[2], b[2]));
        DSU djs = new DSU(n);
        int ans = 0;
        int count = 0;
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            if (djs.find(u) != djs.find(v)) {
                ans += wt;
                djs.unionBySize(u, v);
                count++;
                if (count == n - 1) {
                    break;
                }
            }
        }
        return ans;
    }
}