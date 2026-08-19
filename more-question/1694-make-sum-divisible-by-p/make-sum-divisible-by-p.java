class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i:nums) sum+=i;
        int tar = (int)(sum%p);
        if(tar==0) return 0;
        sum = 0;
        int min = nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int mod = (int)(sum%p);
            int req = (mod-tar+p)%p;
            if(map.containsKey(req)) min = Math.min(min,i-map.get(req));
            map.put(mod,i);
        }
        return (min==nums.length)?-1:min;
    }
}