class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> stsb = new Stack<>();
        Stack<Integer> stit = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int k = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                k = k*10+(c-'0');
            }
            else if(c=='[') {
                stit.push(k);
                stsb.push(ans);
                ans = new StringBuilder();
                k=0;
            }
            else if(c==']'){
                StringBuilder sb = stsb.pop();
                int x = stit.pop();
                for(int j=0;j<x;j++){
                    sb.append(ans);
                }
                ans = sb;
            }
            else ans.append(c);
        }
        return ans.toString();
    }
}