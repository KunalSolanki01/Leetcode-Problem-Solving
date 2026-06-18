class Solution {
    public boolean isP(int []nums,int k,int mid){
        int day = 1;
        int cur = mid;
        for(int i:nums){
            if(cur<i){
                day++;
                cur = mid;
            }
            cur-=i;
        }
        if(day<=k) return true;
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = 0;
        for(int i:weights) max = Math.max(max,i);
        int l = max,h = Integer.MAX_VALUE;
        while(l<=h){
            int capacity = l+(h-l)/2;
            if(isP(weights,days,capacity)) h = capacity-1;
            else l = capacity+1;
        }
        return l;
    }
}