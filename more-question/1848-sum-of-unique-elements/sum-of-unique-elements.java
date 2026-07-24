class Solution {
    public int sumOfUnique(int[] nums) {
        int []freq = new int[101];
        for(int i:nums) freq[i]++;
        int sum = 0;
        for(int i:nums){
            if(freq[i]==1) sum+=i;
        }
        return sum;
    }
}