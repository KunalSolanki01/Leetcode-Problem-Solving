class Solution {
    int[][]dp;
    int min = Integer.MIN_VALUE;
    int helper(int i,int j,int n,List<List<Integer>> tr){
        if(i==n-1) return tr.get(i).get(j);
        if(dp[i][j]!=min) return dp[i][j];
        int x = helper(i+1,j,n,tr);
        int y = helper(i+1,j+1,n,tr);
        return dp[i][j] = tr.get(i).get(j)+Math.min(x,y);
    }
    public int minimumTotal(List<List<Integer>> tr) {
        int n = tr.size();
        dp = new int[n][n];
        for(int []x:dp) Arrays.fill(x,min);
        return helper(0,0,n,tr);
    }
}