class Solution {
    public int arraySign(int[] nums) {
        double mul = 1;
        for(int i:nums){
            if(i==0) return 0;
            mul*=i;
        }
        if(mul<0) return -1;
        return 1;
    }
}