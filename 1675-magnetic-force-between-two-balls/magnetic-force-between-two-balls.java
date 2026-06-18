class Solution {
    public boolean isP(int []nums,int k,int mid){
        int cur = nums[0];
        int s = 1;
        for(int i:nums){
            if(Math.abs(cur-i)>=mid){
                s++;
                cur = i;
            }
        }
        if(s>=k) return false;
        return true;
    }
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int s=1,e = position[n-1];
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isP(position,m,mid)) e = mid-1;
            else s = mid+1;
        }
        return e;
    }
}