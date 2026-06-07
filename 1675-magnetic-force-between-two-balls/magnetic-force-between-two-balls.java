class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int s=1,e = position[n-1];
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int cur = position[0];
            int ball = 1;
            for(int i=1;i<n;i++){
                if(Math.abs(cur-position[i])>=mid){
                    ball++;
                    cur = position[i];
                }
            }
            if(ball>=m){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
}