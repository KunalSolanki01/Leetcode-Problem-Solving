class Solution {
    int[][] floydwarshall(int[][]edges,int n){
        int max = (int)1e5;
        int [][]dist = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j) dist[i][j] = max;
            }
        }
        for(int []p: edges){
            int u = p[0];
            int v = p[1];
            int w = p[2];
            dist[u][v] = w;
            dist[v][u] = w;
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k] != max && dist[k][j] != max){
                        dist[i][j] = Math.min(dist[i][j],dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        return dist;
    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int min = Integer.MAX_VALUE;
        int city = 0;
        edges = floydwarshall(edges,n);
        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int j = 0; j < n; j++) {
                if (edges[i][j] <= distanceThreshold)
                    cur++;
            }
            if (cur <= min) {
                min = cur;
                city = i;
            }
        }
        return city;
    }
}