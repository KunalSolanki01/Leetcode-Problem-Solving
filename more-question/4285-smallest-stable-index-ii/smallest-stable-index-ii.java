class Solution {
    public int firstStableIndex(int[] nums, int k) {
        var pre = new int[nums.length];
        var suf = new int[nums.length];
        pre[0]=nums[0];
        for(var i =1;i<nums.length;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
        }
        suf[nums.length-1]= nums[nums.length-1];
        for(var i = nums.length-2;i>=0;i--){
            suf[i]=Math.min(suf[i+1],nums[i]);
        }
        for(var i =0;i<nums.length;i++){
            if(pre[i]-suf[i]<=k)return i;
        }
        return -1;
    }
}