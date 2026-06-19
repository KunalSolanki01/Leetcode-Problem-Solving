class Graph{
    int n;
    int[][] adj;
    Graph(int n){
        this.n = n;
        adj=new int[n][n];
    }
    void addEdges(int src,int dest){
       adj[src][dest] = 1;
       adj[dest][src] = 1;
    }
    void dfs(int src, boolean[] vis){
        if(vis[src]) return;
        vis[src]=true;
        for(int i=0;i<n;i++){
            if(adj[src][i]==1 && !vis[i]) dfs(i,vis);
        }
    }
}
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Graph g = new Graph(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1) g.addEdges(i,j);
            }
        }
        boolean []vis = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(vis[i]) continue; 
                g.dfs(i,vis);
                count++;
            }
        }
        return count;
    }
}