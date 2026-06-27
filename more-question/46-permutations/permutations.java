class Solution {
    public void helper(List<List<Integer>> ans, List<Integer> temp, int[] nums,int idx){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            helper(ans,temp,nums,idx+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans,temp,nums,0);
        return ans;
    }
}