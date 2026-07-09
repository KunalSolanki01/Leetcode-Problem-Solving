class Solution {
    public boolean valid(char[][] mat,int r,int c,char dig){
        for(int i=0;i<9;i++){
            if(mat[r][i]==dig) return false;
            if(mat[i][c]==dig) return false;
        }
        int sr = (r/3)*3;
        int sc = (c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(mat[sr+i][sc+j]==dig) return false;
            }
        }
        return true;
    }
    public boolean solve(char[][] mat){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(mat[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(valid(mat,i,j,c)){
                            mat[i][j] = c;
                            if(solve(mat)) return true;
                            mat[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}