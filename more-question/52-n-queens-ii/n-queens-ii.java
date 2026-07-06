class Solution {
    static int count = 0;
    public void helper(int r,char[][] mat,boolean[] col,boolean[] dig1,boolean[] dig2,int n){
        if(r==n){
            count++;
            return;
        }
        for(int c=0;c<n;c++){
            int d1 = n+r-c;
            int d2 = r+c;
            if(!col[c] && !dig1[d1] && !dig2[d2]){
                col[c] = dig1[d1] = dig2[d2] = true;
                mat[r][c] = 'Q';
                helper(r+1,mat,col,dig1,dig2,n);
                col[c] = dig1[d1] = dig2[d2] = false;
                mat[r][c] = '.';
            }
        }
    }
    public int totalNQueens(int n) {
        count = 0;
        char [][]mat = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(mat[0],'.');
        }
        boolean []col = new boolean[n];
        boolean []dig1 = new boolean[2*n];
        boolean []dig2 = new boolean[2*n];
        helper(0,mat,col,dig1,dig2,n);
        return count;
    }
}