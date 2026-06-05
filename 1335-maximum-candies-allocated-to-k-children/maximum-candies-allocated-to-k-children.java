class Solution {
    public int maximumCandies(int[] candies, long k) {
        int s = 1,e = Integer.MAX_VALUE;
        int n = candies.length;
        int ans = 0;
        while(s<=e){
            int candy = s+(e-s)/2;
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
        return ans;
    }
}