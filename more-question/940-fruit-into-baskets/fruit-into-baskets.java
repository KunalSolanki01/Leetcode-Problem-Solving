class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int j = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>2){
                int temp = nums[j];
                map.put(temp,map.get(temp)-1);
                if(map.get(temp)==0) map.remove(temp);
                j++;
            }
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}