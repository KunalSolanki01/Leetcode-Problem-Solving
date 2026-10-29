class Solution {
    int[][]dp;
    public int helper(int i,int j,int m,int n){
        if(i==m || j==n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int count = 0;
        if(i==m-1 && j==n-1) {
            count++;
        }
        int l = helper(i+1,j,m,n);
        int r = helper(i,j+1,m,n);
        return dp[i][j] = l+r+count;
    }
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return helper(0,0,m,n);
        // int [][]dp = new int[m][n];
        // for(int i=0;i<m;i++) dp[i][0] = 1;
        // for(int j=0;j<n;j++) dp[0][j] = 1;
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         dp[i][j] = dp[i-1][j]+dp[i][j-1];
        //     }
        // }
        // return dp[m-1][n-1];
    }
}