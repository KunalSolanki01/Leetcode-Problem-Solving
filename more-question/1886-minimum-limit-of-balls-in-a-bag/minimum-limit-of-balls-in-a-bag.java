class Solution {
    public boolean isP(int[] nums,int k,int mid){
        long op = 0;
        for(int i:nums){
            if(mid<i) op+=(i-1)/mid;
        }
        return op<=k;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1,h = 0;
        for(int i:nums) h = Math.max(i,h);
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isP(nums,maxOperations,mid)) h = mid-1;
            else l = mid+1;
        }
        return l;
    }
}