class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[V];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int top = q.poll();
            ans.add(top);
            for (int next : adj.get(top)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }
        return ans;
    }
    public boolean canFinish(int V, int[][] edges) {
        // ArrayList<Integer> ans = topoSort(numCourses,prerequisites);
        // return ans.size()==numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int []arr:edges){
            adj.get(arr[1]).add(arr[0]);
        }
        int []vis = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0) {
                if(!dfs(adj,vis,i)) return false;
            }
        }
        return true;
    }
    boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, int x){
        vis[x] = 1;
        for(int i:adj.get(x)){
            if(vis[i]==1) return false;
             if(vis[i]==0) {
                if(!dfs(adj,vis,i)) return false;
            }
        }
        vis[x] = 2;
        return true;
    }
}