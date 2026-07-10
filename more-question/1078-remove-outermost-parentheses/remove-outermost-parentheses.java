class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        // Stack<Character> st = new Stack<>();
        int len = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                // if(!st.isEmpty()) sb.append(c);
                if(len>0) sb.append(c);
                len++;
                // st.push(c);
            }
            else{
                len--;
                if(len>0) sb.append(c);
                // st.pop();
                // if(!st.isEmpty()) sb.append(c);
            }
        }
        return sb.toString();
    }
}