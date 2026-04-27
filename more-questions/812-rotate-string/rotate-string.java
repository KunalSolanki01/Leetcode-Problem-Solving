class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String s1 = s+s;
        int st=0,e=s.length();
        while(e<=s1.length()){
            if(s1.substring(st,e).equals(goal)) return true;
            st++;
            e++;
        }
        return false;
    }
}