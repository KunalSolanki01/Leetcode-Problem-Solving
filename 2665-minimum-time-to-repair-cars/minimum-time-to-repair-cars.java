class Solution {
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long s = 0,e = Long.MAX_VALUE;
        long ans = Long.MAX_VALUE;
        while(s<=e){
            long time = s+(e-s)/2;
            long sum = 0;
            for(int i=0;i<n;i++){
                sum+=(long)Math.sqrt((double)time/ranks[i]);
            }
            if(sum>=cars){
                ans = time;
                e = time-1;
            }
            else{ 
                s = time+1;
            }
        }
        return ans;
    }
}