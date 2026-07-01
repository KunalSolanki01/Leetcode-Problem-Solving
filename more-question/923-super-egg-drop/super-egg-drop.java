class Solution {
    public int superEggDrop(int k, int n) {
        int l = 1;
        int ans = n;
        int h = n;
        while(l<=h){
            int mid = l+(h-l)/2;
            long cur = 1,total = 0;
            for(int i=1;i<=k;i++){
                if(i<=mid){
                    cur = cur*(mid-i+1)/i;
                    total += cur;
                    if(total>=n){
                        break;
                    }
                }
            }
            if(total>=n){
                ans = mid;
                h = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
}