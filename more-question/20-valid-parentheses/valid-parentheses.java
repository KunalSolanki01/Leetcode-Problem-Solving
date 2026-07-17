class Solution {
    public boolean isValid(String s) {
        int length;
        do {
            length = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (s.length() < length);
        
        return s.isEmpty();
    }
        // if(s.length()%2!=0) return false;
        // int op1 = 0,op2 = 0,op3 = 0;
        // for(char c:s.toCharArray()){
        //     if(c=='(' || c=='{' || c=='['){
        //         if(c=='(') op1++;
        //         else if(c=='{') op2++;
        //         else op3++;
        //     }
        //     else{
        //         if(c==')' && op1>=0) op1--;
        //         else if(c=='}' && op2>=0) op2--;
        //         else if(c==']' && op3>=0) op3--;
        //         else return false;
        //     }
        // }
        // return op1==0 && op2==0 && op3==0;
    
        // Stack<Character> st = new Stack<>();
        // for(char c:s.toCharArray()){
        //     if(c=='(' || c=='[' || c=='{') st.push(c);
        //     else{
        //         if(st.isEmpty()) return false;
        //         else if(st.peek()=='(' && c==')') st.pop();
        //         else if(st.peek()=='[' && c==']') st.pop();
        //         else if(st.peek()=='{' && c=='}') st.pop();
        //         else return false;
        //     }
        // }
        // return st.isEmpty();
}