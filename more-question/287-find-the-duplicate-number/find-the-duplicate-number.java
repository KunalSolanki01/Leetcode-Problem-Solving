class Solution {
    public int findDuplicate(int[] nums) {
        for(int i:nums){
            int x = Math.abs(i);
            if(nums[x]<0) return x;
            nums[x] = -nums[x];
        }
        return -1;
    }
}