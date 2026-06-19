class Graph{
    int n;
    ArrayList<Integer>[] adj;
    
    Graph(int n){
        this.n=n;
        adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<Integer>();
        }        
    } 
    void addEdge(int src,int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }
    boolean hasPath(int src,int dest,boolean[] vis){
        if(src==dest) return true;
        if(vis[src]) return false;
        vis[src]=true;
        for(int nbr:adj[src]){
            if(hasPath(nbr,dest,vis)) return true;
        }
        return false;
    }

}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Graph g=new Graph(n);

        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            g.addEdge(src,dest);
        }

        return g.hasPath(source,destination,new boolean[n]);
    }
}