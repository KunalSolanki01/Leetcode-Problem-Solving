class Solution {
    public boolean isPossible(int []arr,int k,int mid){
        int sCount = 1;
        int cur = 0;
        for(int i:arr){
            if(i>mid) return false;
            if(cur+i<=mid) cur+=i;
            else{
                sCount++;
                cur=i;
            }
        }
        if(sCount>k)return false;
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int l = 0,h = 0;
        for(int i:nums) h+=i;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isPossible(nums,k,mid)) h = mid-1;
            else l = mid+1;
        }
        return l;
    }
}