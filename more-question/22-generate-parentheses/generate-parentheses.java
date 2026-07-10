class Solution {
    public void helper(List<String> ans,int n,int x,int y,String s){
        if(x==n && y==n){
            ans.add(s);
            return;
        }
        if(x<n) helper(ans,n,x+1,y,s+'(');
        if(y<x) helper(ans,n,x,y+1,s+')');
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,n,0,0,"");
        return ans;
    }
}