class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n==1 && nums[0]==target) return new int[] {0,0};
        else if(n==1 && nums[0]!=target) return new int[] {-1,-1};
        int l = 0,h = n-1;
        boolean flag = false;
        int mid = 0;
        while(l<=h){
            mid = l+(h-l)/2;
            if(nums[mid]==target){
                flag = true;
                break;
            }
            else if(nums[mid]>target) h = mid-1;
            else l = mid+1;
        }
        if(!flag) return new int[] {-1,-1};
        l = mid;
        h = mid;
        while(nums[l]==target || nums[h]==target){
            if(l>1 && nums[l-1]==target) l--;
            else if(h<n-1 && nums[h+1]==target) h++;
            else break;
        }
        if(l>0 && nums[l-1]==target) l--;
        if(h<n-1 && nums[h+1]==target) h++;
        return new int[] {l,h};
    }
}