class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int s = 0,e = n*m-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int r = mid/m;
            int c = mid%m;
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]<target) s = mid+1;
            else e = mid-1;
        }
        return false;


        // int l = 0,h = matrix.length-1;
        // while(l<=h){
        //     if(matrix[l][h]==target) return true;
        //     else if(matrix[l][h]<target) l++;
        //     else{
        //         int x = 0;
        //         int y = matrix[0].length-1;
        //         while(x<=y){
        //             int mid = x+(y-x)/2;
        //             if(matrix[l][mid]==target) return true;
        //             else if(matrix[l][mid]<target) x = mid+1;
        //             else y=mid-1;
        //         }
                
        //     }
        // }
        // return false;
    }
}