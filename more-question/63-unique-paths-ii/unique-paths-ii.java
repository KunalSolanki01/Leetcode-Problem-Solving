class Solution {
    int[][]dp;
    public int helper(int i,int j,int m,int n,int [][]grid){
        if(i==m || j==n || grid[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int count = 0;
        if(i==m-1 && j==n-1) {
            count++;
        }
        int l = helper(i+1,j,m,n,grid);
        int r = helper(i,j+1,m,n,grid);
        return dp[i][j] = l+r+count;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        dp = new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return helper(0,0,m,n,grid);
    }
}