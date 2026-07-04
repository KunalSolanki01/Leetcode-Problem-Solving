class Solution {
    static int count = 0;
    public void helper(int []nums,int target,int sum,int idx){
        if(idx>=nums.length){
            if(sum==target) count++; 
            return;
        }
        helper(nums,target,sum+nums[idx],idx+1);
        helper(nums,target,sum-nums[idx],idx+1);
    }
    public int findTargetSumWays(int[] nums, int target) {
        count = 0;
        helper(nums,target,0,0);
        return count;
    }
}