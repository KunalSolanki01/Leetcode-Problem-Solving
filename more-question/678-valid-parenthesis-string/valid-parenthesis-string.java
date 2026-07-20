class Solution {
    Boolean [][]dp;
    boolean isValid(String s,int idx,int open){
        if(open==-1) return false;
        if( idx==s.length()) return open==0;
        if(dp[idx][open]!=null) return dp[idx][open];
        boolean res;
        if(s.charAt(idx)=='*'){
            res = isValid(s, idx+1,open) || isValid(s, idx+1,open+1) || isValid(s, idx+1,open-1);
        }
        else if(s.charAt(idx)==')') res = isValid(s, idx+1,open-1);
        else res = isValid(s, idx+1,open+1);
        dp[idx][open] = res;
        return dp[idx][open];
        // if(s.charAt( idx)=='(') return isValid(s, idx+1,open+1);
        // else if(s.charAt( idx)==')') return isValid(s, idx+1,open-1);
        // else{
        //     return isValid(s, idx+1,open) || isValid(s, idx+1,open+1) || isValid(s, idx+1,open-1);
        // }
    }
    public boolean checkValidString(String s) {
        dp = new Boolean[101][102];
        return isValid(s,0,0);
    }
}