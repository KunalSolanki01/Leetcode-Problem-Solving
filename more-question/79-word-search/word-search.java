class Solution {
    public boolean helper(char[][] mat,int r,int c,int idx,String s){
        if(idx==s.length()) return true;
        if(r<0 || c<0 || r>=mat.length || c>=mat[0].length || mat[r][c]!=s.charAt(idx)) return false;
        char ch = mat[r][c];
        mat[r][c] = '5';
        boolean flag = helper(mat,r-1,c,idx+1,s) ||  helper(mat,r+1,c,idx+1,s) || helper(mat,r,c-1,idx+1,s) || helper(mat,r,c+1,idx+1,s);
        mat[r][c] = ch;
        return flag;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(helper(board,i,j,0,word)){ System.gc();return true;}
            }
        }
        System.gc();
        return false;
    }
}