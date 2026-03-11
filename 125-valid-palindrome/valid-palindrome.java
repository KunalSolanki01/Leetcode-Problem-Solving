class Solution {
    public char lower(char c){
        if(c>='a' && c<='z') return c;
        return (char)((c)-('A'-'a'));
    }
    public boolean check(char ch){
        boolean isLower = (ch >= 'a' && ch <= 'z');
        boolean isUpper = (ch >= 'A' && ch <= 'Z');
        boolean isDigit = (ch >= '0' && ch <= '9');
        return isLower || isUpper || isDigit;
    }
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<j && !(check(s.charAt(i)))) i++;
            while(i<j && !(check(s.charAt(j)))) j--;
            char c = lower(s.charAt(i));
            char ch = lower(s.charAt(j));
            if(c!=ch) return false;
            i++;
            j--;
        }
        return true;
    }
}