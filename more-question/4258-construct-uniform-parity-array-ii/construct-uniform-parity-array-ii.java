class Solution {
    public boolean uniformArray(int[] nums) {
        boolean flag = true;
        int min = Integer.MAX_VALUE;
        for(int i:nums){
            min = Math.min(min,i);
            if(i%2==1) flag = false;
        }
        return flag || min%2==1;
    }
}