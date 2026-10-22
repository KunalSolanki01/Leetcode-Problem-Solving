class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        boolean flag = true;
        for(int i:nums){
            if(i>0) flag = false;
            max = Math.max(max,i);
        }
        if(flag) return max;
        for(int i:nums) set.add(i);
        for(int i:set){
            if(i>0) sum+=i;
        }
        return sum;
    }
}