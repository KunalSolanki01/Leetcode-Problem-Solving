class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int []num1 = Arrays.stream(nums1).distinct().sorted().toArray();
        int []num2 = Arrays.stream(nums2).distinct().sorted().toArray();
        List<Integer> arr = new ArrayList();
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]) arr.add(num1[i]);
            }
        }
        int []ans = arr.stream().mapToInt(i -> i).toArray();
        return ans;
    }
}