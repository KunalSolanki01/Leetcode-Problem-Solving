class Solution {
    public int minCapability(int[] nums, int k) {
        int l = nums[0],h = nums[0];
        for(int i:nums){
            l = Math.min(l,i);
            h = Math.max(h,i);
        }
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isP(nums,k,mid)) h = mid-1;
            else l = mid+1;
        }
        return l;
    }
    public boolean isP(int[] nums, int k,int mid){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                count++;
                i++;
            }
        }
        return count>=k;
    }
}