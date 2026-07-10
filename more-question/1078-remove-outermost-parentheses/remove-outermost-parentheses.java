class Solution {
    public String removeOuterParentheses(String s) {
        String sb = new String();
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(!st.isEmpty()) sb = sb+c;
                st.push(c);
            }
            else{
                st.pop();
                if(!st.isEmpty()) sb = sb+c;
            }
        }
        return sb;
    }
}