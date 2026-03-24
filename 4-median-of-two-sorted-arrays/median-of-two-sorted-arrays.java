class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mg = new ArrayList<>();
        double ans = 0;
        for(int i:nums1) mg.add(i);
        for(int i:nums2) mg.add(i);
        Collections.sort(mg);
        if(mg.size()%2==1){
            ans = mg.get(mg.size()/2);
        }
        else{
            ans = (mg.get((mg.size()+1)/2)+mg.get((mg.size()-1)/2))/2.0;
        }
        return ans;
    }
}