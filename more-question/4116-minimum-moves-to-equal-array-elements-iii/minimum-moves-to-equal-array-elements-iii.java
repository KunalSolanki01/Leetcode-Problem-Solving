class Solution {
    public int minMoves(int[] nums) {
        int sum = 0,max=nums[0];
        for(int i:nums){
            sum+=i;
            max = Math.max(max,i);
        }
        return max*nums.length-sum;
    }
}