class Solution {
    public int maximumCandies(int[] candies, long k) {
        long s = 0,e = Integer.MAX_VALUE;
        int n = candies.length;
        long sum = 0;
        for(long i:candies) sum+=i;
        if(sum<k) return 0;
        long  ans = 0;
        while(s<=e){
            long candy = s+(e-s)/2;
            long cur = 0;
            for(int i=0;i<n;i++){
                cur += (candies[i]/candy);
            }
            if(k<=cur){
                s = candy+1;
                ans = candy;
            }
            else{ 
                e = candy-1;
            }
        }
        return (int)ans;
    }
}