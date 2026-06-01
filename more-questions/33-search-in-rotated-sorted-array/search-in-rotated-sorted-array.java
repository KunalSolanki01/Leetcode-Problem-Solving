class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        int count = 0;
        while(l<=h){
            System.out.println(count);
            int mid = l+(h-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[l]<=nums[mid]){
                if(target>=nums[l] && nums[mid]>target) h=mid-1;
                else l = mid+1;
            }
            else{
                if(target>nums[mid] && target<=nums[h]) l=mid+1;
                else h=mid-1;
            }
            count++;
        }

        // int peak = 0;
        // while(l<=h){
        //     int mid = l+(h-l)/2;
        //     if(nums[0]<=nums[mid]){
        //         peak = mid;
        //         l=mid+1;
        //     }else h = mid-1;
        // }
        // l=0;
        // h=peak;
        // while(l<=h){
        //     int mid = l+(h-l)/2;
        //     if(nums[mid]==target) return mid;
        //     else if(nums[mid]<target) l=mid+1;
        //     else h=mid-1;
        // }
        // l=peak+1;
        // h=n-1;
        // while(l<=h){
        //     int mid = l+(h-l)/2;
        //     if(nums[mid]==target) return mid;
        //     else if(nums[mid]<target) l=mid+1;
        //     else h=mid-1;
        // }
        return -1;

    }
}