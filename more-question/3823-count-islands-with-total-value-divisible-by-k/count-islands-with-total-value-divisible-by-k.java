class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    int cur = dfs(grid,i,j,m,n,k);
                    if(cur==0) ans++;
                }
            }
        }
        return ans;
    }
    int dfs(int[][] grid,int i,int j, int m,int n, int k){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]<=0) return 0;
        int temp = grid[i][j]%k;
        grid[i][j] = -1;
        temp+=(dfs(grid,i-1,j,m,n,k));
        temp+=(dfs(grid,i+1,j,m,n,k));
        temp+=(dfs(grid,i,j-1,m,n,k));
        temp+=(dfs(grid,i,j+1,m,n,k));
        temp%=k;
        return temp;
    }
}