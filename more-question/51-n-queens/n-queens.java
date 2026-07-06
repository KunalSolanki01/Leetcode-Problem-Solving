class Solution {
    public void helper(List<List<String>> ans,int r,int n,char[][]mat,boolean []col,boolean[] dig1,boolean[] dig2){
        if(r==n){
            List<String> temp = new ArrayList<>();
            for(char[] arr:mat) temp.add(new String(arr));
            ans.add(temp);
            return;
        }
        for(int c=0;c<n;c++){
            int d1 = r-c+n;
            int d2 = r+c;
            if(!col[c] && !dig1[d1] && !dig2[d2]){
                mat[r][c] = 'Q';
                col[c] = dig1[d1] = dig2[d2] = true;
                helper(ans,r+1,n,mat,col,dig1,dig2);
                mat[r][c] = '.';
                col[c] = dig1[d1] = dig2[d2] = false;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean []col = new boolean[n];
        boolean []dig1 = new boolean[2*n];
        boolean []dig2 = new boolean[n*2];
        char [][]mat = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(mat[i],'.');
        }
        helper(ans,0,n,mat,col,dig1,dig2);
        return ans;
    }
}