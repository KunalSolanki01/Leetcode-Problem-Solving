class Solution {
    public int minSumOfLengths(int[] A, int T) {
        int n = A.length;
        int max = Integer.MAX_VALUE;
        int[] L = new int[n];
        Arrays.fill(L, max);
        int l = 0, s = 0, m = max;
        for(int r = 0; r < n; r++){
            s += A[r];
            while (s > T){
                s -= A[l++];
            }
            if(s == T){
                m = Math.min(m, r - l + 1);
            }
            L[r] = m;
        }
        int[] R = new int[n];
        Arrays.fill(R, max);
        int p = n - 1;
        s = 0;
        m = max;
        for(int i = n - 1; i >= 0; i--){
            s += A[i];
            while (s > T)
            { s -= A[p--]; }
            if (s == T){
                m = Math.min(m, p - i + 1);
            }
            R[i] = m; 
        }
        int ans = max;
        for (int i = 0; i < n - 1; i++) {
            if (L[i] != max && R[i + 1] != max) {
                ans = Math.min(ans, L[i] + R[i + 1]);
            }
        }
        return ans == max ? -1 : ans;
    }
}