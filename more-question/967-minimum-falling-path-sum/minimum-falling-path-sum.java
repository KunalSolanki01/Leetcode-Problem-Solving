class Solution {
    int[][]dp;
    int max = Integer.MAX_VALUE;
    int helper(int i,int j,int m,int n,int[][]grid){
        if (j < 0 || j >= n)
            return max;
        if (i == m - 1)
            return grid[i][j];
        if (dp[i][j] != max)
            return dp[i][j];
        int x = helper(i+1,j,m,n,grid);
        int y = helper(i+1,j+1,m,n,grid);
        int z = helper(i+1,j-1,m,n,grid);
        return dp[i][j] = grid[i][j]+Math.min(x,Math.min(y,z));
    }
    public int minFallingPathSum(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        dp = new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],max);
        int ans = max;
        for (int j = 0; j < n; j++) ans = Math.min(ans, helper(0, j, m, n, mat));
        return ans;
    }
}