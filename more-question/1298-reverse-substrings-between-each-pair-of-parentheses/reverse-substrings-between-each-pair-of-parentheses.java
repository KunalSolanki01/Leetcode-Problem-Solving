class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==')'){
                StringBuilder sb = new StringBuilder();
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
                for(int j=0;j<sb.length();j++) st.push(sb.charAt(j));
            }
            else st.push(c);
        }
        while(!st.isEmpty()) ans.append(st.pop());
        return ans.reverse().toString();
    }
}