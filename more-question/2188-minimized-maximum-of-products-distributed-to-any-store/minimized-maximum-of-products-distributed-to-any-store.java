class Solution {
    public int minimizedMaximum(int k, int[] nums) {
        int n = nums.length;
        int l = 0,h = 0;
        for(int i:nums){
            h = Math.max(h,i);
        }
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isP(nums,k,mid)) h = mid-1;
            else l = mid+1;
        }
        return l;
    }
    public boolean isP(int[] nums,int k,int mid){
        int count = 0;
        if(mid==0) return false;
        for(int i:nums){
            // count+=Math.ceil((double)i/(mid));
            count+=(i+mid-1)/mid;
        }
        return count<=k;
    }
}