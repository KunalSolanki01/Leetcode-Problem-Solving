class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] arr = new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = board[i][j];
                int row = 0;
                if(c!='.'){
                    while(row<9){
                        if(row!=j && board[i][row]==c) return false;
                        if(row!=i && board[row][j]==c) return false;
                        row++;
                    }
                    row = (i/3)*3+(j/3);
                    int col = c-'1';
                    if(arr[row][col]) return false;
                    arr[row][col] = true;
                }
            }
        }
        return true;
    }
}