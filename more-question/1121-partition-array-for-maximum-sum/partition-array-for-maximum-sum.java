class Solution {
    int []dp;
    int helper(int idx,int []arr,int k){
        int n = arr.length;
        if(idx==n) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int len = 0;
        int maxn = Integer.MIN_VALUE;
        int maxs = Integer.MIN_VALUE;
        for(int i=idx;i<Math.min(n,idx+k);i++){
            len++;
            maxn = Math.max(maxn,arr[i]);
            int sum = maxn*len + helper(i+1,arr,k);
            maxs = Math.max(maxs,sum);
        }
        return dp[idx] = maxs;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(0,arr,k);
    }
}