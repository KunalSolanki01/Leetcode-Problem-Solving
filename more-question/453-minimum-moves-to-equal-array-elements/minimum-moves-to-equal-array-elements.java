class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0,n = nums.length;
        for(int i:nums){
            min = Math.min(min,i);
            sum+=i;
        }
        return sum-n*min;
    }
}