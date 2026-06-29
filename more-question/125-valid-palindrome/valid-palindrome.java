class Solution {
    public boolean f(String s,int i,int j){
        if(i>=j) return true;
        if(!Character.isLetterOrDigit(s.charAt(i))) return f(s,i+1,j);
        if(!Character.isLetterOrDigit(s.charAt(j))) return f(s,i,j-1);
        if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) return false;
        return f(s,i+1,j-1);
    }
    public boolean isPalindrome(String s) {
        return f(s,0,s.length()-1);
    }
}