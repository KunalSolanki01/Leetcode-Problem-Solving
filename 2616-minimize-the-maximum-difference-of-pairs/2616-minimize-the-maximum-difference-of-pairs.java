class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0,h=nums[n-1]-nums[0];
        int ans = 0;
        while(l<h){
            int mid = l+(h-l)/2;
            int cur = 0;
            for(int i=1;i<n;){
                if(nums[i]-nums[i-1]<=mid){
                    cur++;
                    i+=2;
                }
                else i++;
                if(cur>=p) break;
            }
            if(cur>=p){
                ans = l;
                h = mid;        
            }else l = mid+1;
        }
        return l;
    }
}