class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dist = new int[n];
        int max = (int)1e5;
        Arrays.fill(dist,max);
        dist[src] = 0;
        for(int i=0;i<=k;i++){
            int []temp = dist.clone();
            for(int []p:flights){
                int u = p[0];
                int v = p[1];
                int w = p[2];
                if(dist[u]!=max && dist[u]+w<temp[v]){
                    temp[v] = dist[u]+w;
                }
            }
            dist = temp;
        }
        return dist[dst] == max?-1 : dist[dst];
    }
}