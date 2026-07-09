class Solution {
    public void helper(List<List<Integer>> ans,List<Integer> temp,int idx,int n,int k){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<=n;i++){
            temp.add(i);
            helper(ans,temp,i+1,n,k);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(ans,temp,1,n,k);
        return ans;
    }
}