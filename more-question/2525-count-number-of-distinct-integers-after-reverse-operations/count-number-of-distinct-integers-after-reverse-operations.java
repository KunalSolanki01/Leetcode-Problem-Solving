class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
            int rev = 0;
            while(i!=0){
                rev = (rev*10)+(i%10);
                i/=10;
            }
            set.add(rev);
        }
        return set.size();
    }
}