class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        long l = 1,h = time[0];
        for(int i:time){
            h = Math.min(h,i);
        }
        h*=totalTrips;
        while(l<=h){
            long mid = l+(h-l)/2;
            if(isP(time,totalTrips,mid)) h = mid-1;
            else l = mid+1;
        }
        return l;
    }
    public boolean isP(int[] nums,int k,long mid){
        long count = 0;
        for(int i:nums){
            count+=(mid/i);
            if(count>=k) return true;
        }
        return count>=k;
    }
}