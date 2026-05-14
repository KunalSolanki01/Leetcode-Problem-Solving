class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(nums[n-1]+1!=nums.length) return false;
        int k = nums[n-1];
        for(int i=0;i<n;i++){
            if(i<n-2 && nums[i]==nums[i+1]){
                 return false;
            }
            else{
                if(nums[i]==k) return true;
            }
        }
        return true;
    }
}