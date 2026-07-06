class Solution {
    public void helper(List<List<String>> ans,int r,char[][] mat,boolean[] col,boolean[] dig1,boolean[] dig2,int n){
        if(r==n){
            List<String> temp = new ArrayList<>();
            for(char[] arr:mat) temp.add(new String(arr));
            ans.add(temp);
            return;
        }
        for(int c=0;c<n;c++){
            int d1 = n+r-c;
            int d2 = r+c;
            if(!col[c] && !dig1[d1] && !dig2[d2]){
                col[c] = dig1[d1] = dig2[d2] = true;
                mat[r][c] = 'Q';
                helper(ans,r+1,mat,col,dig1,dig2,n);
                col[c] = dig1[d1] = dig2[d2] = false;
                mat[r][c] = '.';
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][]mat = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(mat[0],'.');
        }
        boolean []col = new boolean[n];
        boolean []dig1 = new boolean[2*n];
        boolean []dig2 = new boolean[2*n];
        helper(ans,0,mat,col,dig1,dig2,n);
        return ans.size();
    }
}