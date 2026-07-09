class Solution {
    public void helper(int idx,int p,String s,List<String> cur,List<String> ans){
        if(p==4){
            if(idx==s.length()) ans.add(s.join(".",cur));
            return;
        }
        for(int i=1;i<=3;i++){
            if(idx+i>s.length()) break;
            String temp = s.substring(idx,idx+i);
            int val = Integer.parseInt(temp);
            if(temp.length()>1 && temp.startsWith("0")) continue;
            if(val>255) continue;
            cur.add(temp);
            helper(idx+i,p+1,s,cur,ans);
            cur.remove(cur.size()-1);
        }
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        if(s.length()<4 || s.length()>12) return ans;
        helper(0,0,s,new ArrayList<>(),ans);
        return ans;
    }
}