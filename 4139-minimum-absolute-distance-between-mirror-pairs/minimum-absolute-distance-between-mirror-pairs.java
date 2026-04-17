class Solution {
    int rev(int num){
        int rev = 0;
        while(num!=0){
            rev = rev*10+num%10;
            num/=10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(nums[i])){
                min = Math.min(min, i - map.get(nums[i]));
            }

            int r = rev(nums[i]);
            map.put(r, i); // ✅ store latest index
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}