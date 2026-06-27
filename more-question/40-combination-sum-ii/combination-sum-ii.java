class Solution {
    public void helper(List<List<Integer>> ans,List<Integer> temp,int[] arr,int target,int sum,int idx){
        // if(idx==arr.length) return;
        // if(ans.contains(temp)) return;
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target) return;
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            helper(ans,temp,arr,target,sum+arr[i],i+1);
            temp.remove(temp.size()-1);
        }
        return;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans,temp,candidates,target,0,0);
        return ans;
    }
}