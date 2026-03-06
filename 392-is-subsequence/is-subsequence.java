class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        // if(s.length()==t.length()) return s.equals(t);  
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
                i++;
            }else{j++;}
        }
        if(i==s.length()&&j<t.length()+1) return true;
        return false;
    }
}