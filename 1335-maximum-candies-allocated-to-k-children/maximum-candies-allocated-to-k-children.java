class Solution {
    public boolean isP(int []nums,long k,int mid){
        long cur = 0;
        for(int i:nums){
            cur+=(i/mid);
        }
        if(cur>=k) return false;
        return true;
    }
    public int maximumCandies(int[] candies, long k) {
        int s = 1,e = Integer.MAX_VALUE;
        int n = candies.length;
        int ans = 0;
        while(s<=e){
            int candy = s+(e-s)/2;
            if(isP(candies,k,candy)) e = candy-1;
            else s = candy+1;
        }
        return e;
    }
}