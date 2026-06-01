class Solution {
    public int search(int[] nums, int target) {
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
        l=0;
        h=peak;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) l=mid+1;
            else h=mid-1;
        }
        l=peak+1;
        h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) l=mid+1;
            else h=mid-1;
        }
        return -1;

    }
}