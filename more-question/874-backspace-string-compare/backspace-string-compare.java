class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        int n = s.length();
        int m = t.length();
        for(int i=0;i<Math.max(m,n);i++){
            if(i<n){
                char c = s.charAt(i);
                if(c!='#') st1.push(c);
                else if(c=='#' && !st1.isEmpty()) st1.pop();
            }
            if(i<m){
                char c = t.charAt(i);
                if(c!='#') st2.push(c);
                else if(c=='#' && !st2.isEmpty()) st2.pop();
            }
        }
        while(!st1.isEmpty() && !st2.isEmpty()){
            char c1 = st1.pop();
            char c2 = st2.pop();
            if(c1!=c2) return false;
        }
        return st1.isEmpty() && st2.isEmpty();
    }
}