class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int n = t.length(),m=s.length();
        int i=0,j=0;
        while(i<n){
        if(t.charAt(i)==s.charAt(j)){
            j++;
        }
        i++;
        
        if(j==m)
            return true;
        }

        return false;
    }
}