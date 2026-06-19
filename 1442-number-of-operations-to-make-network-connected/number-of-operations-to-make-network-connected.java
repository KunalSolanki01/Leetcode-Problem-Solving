class Graph{
    int n;
    ArrayList<Integer>[] adj;
    Graph(int n){
        this.n = n;
        adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }
    }
    void addEdges(int src,int des){
        adj[src].add(des);
        adj[des].add(src);
    }
    void dfs(int src, boolean[] vis){
        if(vis[src]) return;
        vis[src]=true;
        for(int nbr:adj[src]){
            dfs(nbr,vis);
        }
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        Graph g = new Graph(n);
        if(connections.length<n-1) return -1;
        for(int i=0;i<connections.length;i++){
            g.addEdges(connections[i][0],connections[i][1]);
        }
        boolean []vis = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(vis[i]) continue;
            g.dfs(i,vis);
            count++;
        }
        return count-1;
    }
}