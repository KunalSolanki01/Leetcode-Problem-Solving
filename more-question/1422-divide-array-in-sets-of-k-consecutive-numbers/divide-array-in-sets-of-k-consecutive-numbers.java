class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0){
            return false;
        }
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(int i:nums){
            if(map.get(i)>0){
                for(int j=0;j<k;j++){
                    int val = i+j;
                    int count = map.getOrDefault(val,0);
                    if(count<=0) return false;
                    map.put(val,count-1);
                }
            }
        }
        return true;
    }
}