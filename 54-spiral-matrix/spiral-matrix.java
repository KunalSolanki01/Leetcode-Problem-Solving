class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int srow=0;
        int erow=m-1;
        int scol=0;
        int ecol=n-1;
        while(srow<=erow && scol<=ecol){
            // starting row
            for(int i=scol;i<=ecol;i++){
                ans.add(matrix[srow][i]);
            }
            srow++;
            // ending col
            for(int i=srow;i<=erow;i++){
                ans.add(matrix[i][ecol]);
            }
            ecol--;
            // ending row
            if(srow<=erow)
            {
                for(int i=ecol;i>=scol;i--){
                    ans.add(matrix[erow][i]);
                }
                erow--;
            }
            if(scol<=ecol){
                for(int i=erow;i>=srow;i--){
                    ans.add(matrix[i][scol]);
                }
                scol++;
            }
        }
        return ans;
    }
}