class Solution {
    static int count = 0;
    public void helper(int []nums,int target,int sum,int idx,int cur){
        if(idx==nums.length){
            if((sum+target)%2!=0) return;
            if(cur==(sum+target)/2) count++;
            return;
        }
        helper(nums,target,sum,idx+1,cur+nums[idx]);
        helper(nums,target,sum,idx+1,cur);
        // if(idx>=nums.length){
        //     if(sum==target) count++; 
        //     return;
        // }
        // helper(nums,target,sum+nums[idx],idx+1);
        // helper(nums,target,sum-nums[idx],idx+1);
    }
    public int findTargetSumWays(int[] nums, int target) {
        count = 0;
        helper(nums,target,Arrays.stream(nums).sum(),0,0);
        return count;
    }
}