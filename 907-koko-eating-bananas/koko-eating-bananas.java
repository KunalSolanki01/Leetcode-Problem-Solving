class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int s = 1,e = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        while(s<=e){
            int rate = s+(e-s)/2;
            long hour = 0;
            for(int i=0;i<n;i++){
                hour += (long)Math.ceil((double)piles[i]/(double)rate);
            }
            if(hour<=h){
                ans = rate;
                e = rate-1;
            }
            else s = rate+1;
        }
        return ans;
    }
}