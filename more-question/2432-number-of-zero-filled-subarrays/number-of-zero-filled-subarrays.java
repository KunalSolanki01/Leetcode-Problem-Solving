class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long ans = 0;
        for(int i:nums){
            if(i==0){
                count++;
                ans+=count;
            }else count = 0;
        }
        return ans;
    }
}