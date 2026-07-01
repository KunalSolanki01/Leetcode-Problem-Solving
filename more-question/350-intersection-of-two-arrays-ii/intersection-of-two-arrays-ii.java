class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] freq = new int[1002];
        for(int i:nums1){
            freq[i]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(freq[nums2[i]]-->0) {
                arr.add(nums2[i]);
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}