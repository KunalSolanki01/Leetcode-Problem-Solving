class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(!st.isEmpty()) sb.append(c);
                st.push(c);
            }
            else{
                st.pop();
                if(!st.isEmpty()) sb.append(c);
            }
        }
        return sb.toString();
    }
}