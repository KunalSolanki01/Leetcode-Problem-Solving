class Solution {
    boolean dfs(int[][] mat, int[][] vis, int mid, int r,int c){
        int n = mat.length;
        int m = mat[0].length;
        if(r<0|| c<0 || r>=n || c>=m || vis[r][c]==1) return false;
        if(r==n-1 && c==m-1) return true;
        vis[r][c] = 1;
        boolean[] flag = new boolean[4];
        if(r+1<n && Math.abs(mat[r][c]-mat[r+1][c])<=mid) flag[0] = dfs(mat,vis,mid,r+1,c);
        if(r-1>=0 && Math.abs(mat[r][c]-mat[r-1][c])<=mid) flag[1] = dfs(mat,vis,mid,r-1,c);
        if(c+1<m && Math.abs(mat[r][c]-mat[r][c+1])<=mid) flag[2] = dfs(mat,vis,mid,r,c+1);
        if(c-1>=0 && Math.abs(mat[r][c]-mat[r][c-1])<=mid) flag[3] = dfs(mat,vis,mid,r,c-1);
        return flag[0] || flag[1] || flag[2] || flag[3];
    }
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        int l = 0,h = (int)1e7;
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            int[][] vis = new int[n][m];
            if(dfs(heights,vis,mid,0,0)){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
}