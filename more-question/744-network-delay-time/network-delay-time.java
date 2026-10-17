class Solution {
    int[] dijkstra(List<List<int[]>> adj, int n, int src) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[] dist = new int[n + 1];
        Arrays.fill(dist, 10000);
        dist[src] = 0;
        pq.add(new int[] { 0, src });
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int d = top[0];
            int u = top[1];
            if (d > dist[u])
                continue;
            for (int[] p : adj.get(u)) {
                int v = p[0];
                int w = p[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new int[] { dist[v], v });
                }
            }
        }
        return dist;
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());
        for (int[] p : times) {
            int u = p[0];
            int v = p[1];
            int w = p[2];
            adj.get(u).add(new int[] { v, w });
        }
        int[] dist = dijkstra(adj, n, k);
        int max = 10000;
        int cur = -1;
        for (int i=1;i<=n;i++) {
            if (dist[i] == 10000) return -1;
            cur = Math.max(cur, dist[i]);
        }
        return cur;
    }
}