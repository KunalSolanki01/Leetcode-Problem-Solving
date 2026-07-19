class Solution {
    public int minStartValue(int[] nums) {
        int pre = 0,min = Integer.MAX_VALUE;
        for(int i:nums){
            pre+=i;
            min = Math.min(min,pre);
        }
        return Math.max(1,1-min);
    }
}