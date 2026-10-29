class Solution {
    int [][]dp;
    int helper(int i,int j,int m,int n,int[][] grid){
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(i==m-1 && j==n-1) return grid[i][j]; 
        if(dp[i][j] != -1) return dp[i][j];
        int x = helper(i+1,j,m,n,grid);
        int y = helper(i,j+1,m,n,grid);
        return dp[i][j] = grid[i][j]+Math.min(x,y);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return helper(0,0,m,n,grid);
        // dp[0][0] = grid[0][0];
        // for (int i = 1; i < n; i++)
        //     dp[i][0] = dp[i - 1][0] + grid[i][0];
        // for (int j = 1; j < m; j++)
        //     dp[0][j] = dp[0][j - 1] + grid[0][j];
        // for (int i = 1; i < n; i++) {
        //     for (int j = 1; j < m; j++) {
        //         dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
        //     }
        // }
        // return dp[n - 1][m - 1];
    }
}