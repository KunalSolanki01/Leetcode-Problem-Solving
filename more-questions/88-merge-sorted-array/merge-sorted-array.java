class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while(i<m+n && j<n){
            if(nums1[i]==0) nums1[i]=nums2[j++];
            else if(j<n && nums1[i]>nums2[j]){
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
            }
            if(j<n && nums1[i]<=nums2[j]) i++;
        }
        Arrays.sort(nums1);
    }
}