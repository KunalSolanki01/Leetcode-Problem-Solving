class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Integer []arr = new Integer[mat.length];
        Integer []ct = new Integer[mat.length];
        for(int i=0;i<mat.length;i++){
            ct[i] = i;
        }
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[0].length;j++){
                count+=mat[i][j];
            }
            arr[i] = count;
        }
        Arrays.sort(ct,(a,b)->arr[a]-arr[b]);
        int ans[] = new int[k];
        for(int j=0;j<k;j++){
            ans[j] = ct[j];
        }
        return ans;
    }
}