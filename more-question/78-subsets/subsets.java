class Solution {
    public void helper(int idx,List<Integer> temp,List<List<Integer>> ans,int[] nums){
        if(idx==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        helper(idx+1, temp, ans, nums);
        temp.remove(temp.size()-1);
        helper(idx+1,temp,ans,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0,temp,ans,nums);
        return ans;
    }
}