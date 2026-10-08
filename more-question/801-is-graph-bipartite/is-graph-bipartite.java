class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        int[] depth = new int[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (bfs(graph, i, vis, depth)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean bfs(int[][] graph, int start, boolean[] vis, int[] depth) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;
        depth[start] = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nbr : graph[node]) {
                if (!vis[nbr]) {
                    vis[nbr] = true;
                    depth[nbr] = depth[node] + 1;
                    q.add(nbr);
                } 
                else {
                    int clen = Math.abs(depth[node] - depth[nbr]) + 1;
                    if (clen % 2 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}