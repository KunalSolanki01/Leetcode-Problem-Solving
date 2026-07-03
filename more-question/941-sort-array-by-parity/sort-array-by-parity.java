class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int st = 0;
        int end = nums.length-1;
        while(end>=st){
            while(end>=st && nums[st]%2==0) st++;
            while(end>=st && nums[end]%2!=0) end--;
            if(st<=end){
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
            }
            st++;
            end--;
        }
        return nums;
    }
}