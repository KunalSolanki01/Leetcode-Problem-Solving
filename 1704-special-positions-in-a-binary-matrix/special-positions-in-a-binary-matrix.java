class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int ans = 0;
        int[] r = new int[n];
        int[] c = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    r[i]++;
                    c[j]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && r[i]==1 && c[j]==1) ans++;
            }
        }
        return ans;
    }
}