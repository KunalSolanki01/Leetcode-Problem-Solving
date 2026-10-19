class Solution {
    int ans = 0;
    boolean dfs(int[][]grid,int[][]vis ,int mid,int i,int j){
        int n = grid.length;
        if(i<0 || j<0 || i>=n || j>=n || vis[i][j]==1 || grid[i][j] > mid) return false;
        vis[i][j] = 1;
        if(i==n-1 && j==n-1) return true;
        boolean f1 = dfs(grid,vis,mid,i+1,j);
        boolean f2 = dfs(grid,vis,mid,i-1,j);
        boolean f3 = dfs(grid,vis,mid,i,j+1);
        boolean f4 = dfs(grid,vis,mid,i,j-1);
        return f1 || f2 || f3 || f4;
    }
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int l = 0, h = (int)1e5;
        while(l<=h){
            int mid = l+(h-l)/2;
            int[][] vis = new int[n][n];
            if(dfs(grid,vis,mid,0,0)){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
}