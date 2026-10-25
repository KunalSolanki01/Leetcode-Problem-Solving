class DSU{
    int n;
    int []par;
    int []size;
    DSU(int n){
        this.n = n;
        par = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            par[i] = i;
            size[i] = 1;
        }
    }
    int find(int x){
        if(par[x]==x) return x;
        return par[x] = find(par[x]);
    }
    void union(int x,int y){
        int a = find(x);
        int b = find(y);
        if(a==b) return;
        if(size[a]<size[b]){
            int temp = a;
            a = b;
            b = temp;
        }
        par[b] = a;
        size[a]+=size[b];
    }
}
class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int total = n*m;
        DSU dsu = new DSU(total+1);
        int [][]dir = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    int cur = i*m+j;
                    if(i==0 || i==n-1 || j==0|| j==m-1) dsu.union(cur,total);
                    for(int []d:dir){
                        int r = i+d[0];
                        int c = j+d[1];
                        if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==0){
                            int nbr = r*m+c;
                            dsu.union(cur,nbr);
                        }
                    }
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        int temp = dsu.find(total);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    int cur = i*m+j;
                    int root = dsu.find(cur);
                    if(root!=temp) set.add(root);
                }
            }
        }
        return set.size();
    }
}