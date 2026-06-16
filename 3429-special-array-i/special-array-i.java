class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean even = false;
        boolean odd = false;
        for(int i:nums){
            if(i%2==0 && !odd){
                odd = true;
                even = false;
            }
            else if(i%2!=0 && !even){
                odd = false;
                even = true;
            }
            else return false;
        }
        return true;
    }
}