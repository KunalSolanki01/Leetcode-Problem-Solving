class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int []arr = new int[n];
        int rightSum = 0;
        int leftSum = 0;
        for(int i:nums) rightSum+=i;
        for(int i=0;i<n;i++){
            rightSum-=nums[i];
            arr[i] = Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        return arr;
    }
}