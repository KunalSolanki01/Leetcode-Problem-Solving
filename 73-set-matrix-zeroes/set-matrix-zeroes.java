class Solution {
    public void setZeroes(int[][] matrix) {

        // int n = matrix.length;
        // int m = matrix[0].length;
        // boolean row1 = false, col1 = false;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(matrix[i][j]==0){
        //             if(i==0) row1 = true;
        //             if(j==0) col1 = true;
        //         }
        //     }
        // }









        int m=matrix.length;
        int n = matrix[0].length;
        boolean []rows = new boolean[m];
        boolean []cols = new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0) rows[i]=cols[j]=true;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows[i] || cols[j]) matrix[i][j]=0;
            }
        }

    }
}