class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[]s = new int[n + 1];
        int[][]f = new int[n][n + 1];
        for(int i=0;i<n;i++){
            s[i+1]=s[i]+piles[i];
        }
        return dfs(0, 1,n,s,f);
    }
    int dfs(int i, int m,int n,int[]s,int[][]f) {
        if(m*2>=n-i) return s[n] - s[i];
        if(f[i][m]!=0) return f[i][m];
        int res = 0;
        for(int x=1;x<=m*2;x++) {
            res = Math.max(res,s[n]-s[i] - dfs(i+x,Math.max(m,x),n,s,f));
        }
        return f[i][m] = res;        
    }
}