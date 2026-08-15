class Solution {
    boolean sorted(int[] nums,int n){
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        int ans = 0;
        while(!sorted(nums,n)){
            ans++;
            int min = Integer.MAX_VALUE;
            int pos = -1;
            for(int i=1;i<n;i++){
                int sum = nums[i-1]+nums[i];
                if(sum<min){
                    min = sum;
                    pos = i;
                }
            }
            nums[pos-1] = min;
            for(int i=pos;i<n-1;i++) nums[i] = nums[i+1];
            n--;
        }
        return ans;
    }
}