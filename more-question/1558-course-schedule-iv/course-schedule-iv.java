class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges,boolean[][] flag) {
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
            int u = q.poll();
            ans.add(u);
            for (int v : adj.get(u)) {
                flag[u][v] = true;
                for(int i=0;i<V;i++){
                    if(flag[i][u]) flag[i][v] = true;
                }
                indegree[v]--;
                if(indegree[v]==0) q.add(v);
            }
        }
        return ans;
    }

    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] flag = new boolean[numCourses][numCourses];
        ArrayList<Integer> arr = topoSort(numCourses,prerequisites,flag);
        List<Boolean> ans = new ArrayList<>();
        for(int []q:queries){
            int u = q[0];
            int v = q[1];
            ans.add(flag[u][v]);
        }
        return ans;
    }
}