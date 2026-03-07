class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1,idx = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                k++;
            }
            else k = 1;
            if(k<=2){
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}