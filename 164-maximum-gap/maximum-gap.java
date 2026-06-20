class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);
        int gap = 0;
        for(int i=0;i<n-1;i++){
            gap = Math.max(gap,(nums[i+1]-nums[i]));
        }
        return gap;
    }
}