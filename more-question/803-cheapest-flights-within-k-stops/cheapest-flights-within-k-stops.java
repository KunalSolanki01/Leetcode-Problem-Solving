class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int []p:flights){
            adj.get(p[0]).add(new int[]{p[1],p[2]});
        }
        Queue<int[]> q = new ArrayDeque<>();
        int []dist = new int[n];
        Arrays.fill(dist,(int)1e5);
        q.add(new int[]{0,src,0});
        dist[src] = 0;
        while(!q.isEmpty()){
            int []p = q.poll();
            int u = p[0];
            int v = p[1];
            int w = p[2];
            if(u>k) continue;
            for(int []i:adj.get(v)){
                int m = i[0];
                int l = i[1];
                int uw = w+l;
                if(uw<dist[m] && u<=k){
                    dist[m] = uw;
                    q.add(new int[]{u+1,m,uw});
                }
            }
        }
        return dist[dst] == (int)1e5?-1:dist[dst];
    }
}