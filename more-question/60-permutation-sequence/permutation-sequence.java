class Solution {
    public void helper(List<String> ans,StringBuilder temp,boolean[] flag,int n){
        if(temp.length()==n){
            ans.add(temp.toString());
            return;
        }
        for (int i=1;i<=n;i++) {
            if(flag[i]) continue;
            flag[i] = true;
            temp.append(i);
            helper(ans, temp,flag,n);
            temp.deleteCharAt(temp.length()-1);
            flag[i] = false;
        }
    }
    public String getPermutation(int n, int k) {
        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        boolean []flag = new boolean[n+1];
        helper(ans,temp,flag,n);
        // for(String s:ans) System.out.print(s+" ");
        return ans.get(k-1);
    }
} 