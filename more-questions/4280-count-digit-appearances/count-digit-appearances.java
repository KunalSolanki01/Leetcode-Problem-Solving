class Solution {
    public int digitCount(int n,int k){
        int digitC = 0;
        while(n!=0){
            int rem = n%10;
            if(rem==k) digitC++;
            n/=10;
        }
        return digitC;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i:nums){
            count+=digitCount(i,digit);
        }
        return count;
    }
}