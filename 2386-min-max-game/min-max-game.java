class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        int idx = 0;
        while(n!=1){
            for(int i=0;i<n-1;i+=2){
                if(idx%2==0) nums[idx++] = Math.min(nums[i],nums[i+1]);
                else nums[idx++] = Math.max(nums[i],nums[i+1]);
            }
            idx = 0;
            n/=2;
        }
        return nums[0];
    }
}