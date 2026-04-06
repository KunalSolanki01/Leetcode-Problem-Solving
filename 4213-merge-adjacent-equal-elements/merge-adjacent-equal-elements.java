class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add((long)nums[i]);
            while(arr.size()>=2 && arr.get(arr.size()-1).equals(arr.get(arr.size()-2))){
                long a = arr.remove(arr.size()-1);
                arr.set(arr.size()-1,arr.get(arr.size()-1)+a);
            }
        }
        return arr;
    }
}