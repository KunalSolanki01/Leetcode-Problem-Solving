class Solution {
    boolean isP(int []nums,int k,int mid){
        int sum = 0;
        for(int i:nums){
            sum+=(i+mid-1)/mid;
        }
        return sum<=k;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 1,h = nums[n-1];
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isP(nums,threshold,mid)) h = mid-1;
            else l = mid+1;
        }
        return l;
    }
}