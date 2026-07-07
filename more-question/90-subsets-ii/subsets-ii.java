class Solution {
    void f(int ind,int []nums,List<Integer> temp,List<List<Integer>> ans){

        ans.add(new ArrayList<>(temp));

        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            f(i+1,nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        f(0,nums,temp,ans);
        return ans;
    }
}