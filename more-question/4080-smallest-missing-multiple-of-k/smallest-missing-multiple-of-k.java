class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0) map.put(nums[i],nums[i]/k);
        }
        for(int i=1;i<=100;i++){
            int val = i*k;
            if(map.containsKey(val)) continue;
            return val;
        }
        return 101;
    }
}