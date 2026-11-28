class Solution {
    int [][]dp;
    int helper(String s,int i,int j){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min = 2001;
        for(int k=i;k<=j;k++){
            if(isPal(s,i,k)){
                int temp = 1+helper(s,k+1,j);
                min = Math.min(min,temp);
            }
        }
        return dp[i][j] = min;
    }
    boolean isPal(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int minCut(String s) {
        int n = s.length();
        dp = new int[n][n];
        for(int []x:dp) Arrays.fill(x,-1);
        return helper(s,0,n-1)-1;
    }
}