class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target) return true;
            if(nums[l]==nums[mid] && nums[mid]==nums[h]){
                l++;
                h--;
                continue;
            }
            else if(nums[l]<=nums[mid]){
                if(target>=nums[l] && nums[mid]>target) h=mid-1;
                else l = mid+1;
            }
            else{
                if(target>nums[mid] && target<=nums[h]) l=mid+1;
                else h=mid-1;
            }
        }
        return false;
    }
}