class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int min = 1001,max = 0;
        for(int i:nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        return gcd(max,min);
    }
}