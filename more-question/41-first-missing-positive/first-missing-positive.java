class Solution {
    public int firstMissingPositive(int[] nums) {
        int mis = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        while(map.containsKey(mis)) mis++;
        return mis;
    }
}