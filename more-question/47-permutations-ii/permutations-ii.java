class Solution {
     public void helper(int ind, List<List<Integer>> ans, List<Integer> temp, int[] nums,boolean[] vis) {
        if (temp.size() == nums.length) {
            if(!(ans.contains(temp))) ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(vis[i]) continue;
            if(i > 0 && nums[i] == nums[i-1] && !vis[i-1]) continue;
            vis[i] = true;
            temp.add(nums[i]);
            helper(ind + 1, ans, temp, nums,vis);
            temp.remove(temp.size()-1);
            vis[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] vis = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0,ans,temp, nums,vis);
        return ans;
    }
}