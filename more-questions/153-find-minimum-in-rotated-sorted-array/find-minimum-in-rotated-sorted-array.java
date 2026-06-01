class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1;
        int peak = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[0]<=nums[mid]){
                peak = mid;
                l=mid+1;
            }else h = mid-1;
        }
        if(peak==n-1) return nums[0];
        return nums[peak+1];
    }
}