class Solution {
    void helper(int idx,int sum,List<Integer> temp,List<List<Integer>> ans,int k,int n){
        if(temp.size()==k){
            if(sum==n) ans.add(new ArrayList<>(temp));
            return;
        }
        // if(temp.size()>k || sum>n) return;
        for(int i=idx;i<=9;i++){
            if(temp.size()>k || sum>n) return;
            temp.add(i);
            helper(i+1,sum+i,temp,ans,k,n);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(1,0,temp,ans,k,n);
        return ans;
    }
}