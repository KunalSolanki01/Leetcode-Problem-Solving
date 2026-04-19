class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int j=0;
        int n=nums1.length, m=nums2.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(j<i) j=i+1;
            while(j<m && nums2[j]>=nums1[i]) j++;
            max = Math.max(max,j-i-1);
        }
        return max;
    }
}