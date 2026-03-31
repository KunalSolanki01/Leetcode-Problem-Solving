class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int sign = 1;
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0'&&c<='9'){
                flag = false;
                if (ans > (Integer.MAX_VALUE - (c-'0')) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ans = ans*10+(c-'0');
            }
            else if(c==' ' && flag) continue;
            else if ((c == '-' || c == '+') && flag) {
                sign = (c == '-') ? -1 : 1;
                flag = false; 
            }
            else break;
        }
        return ans*sign;
    }
}