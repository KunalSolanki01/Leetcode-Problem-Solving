class Solution {
    public void helper(List<List<Integer>> ans,List<Integer> temp,int[] arr,int target,int sum,int idx){
        if(sum>target) return;
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);
            helper(ans,temp,arr,target,sum+arr[i],i);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans,temp,candidates,target,0,0);
        return ans;
    }
}