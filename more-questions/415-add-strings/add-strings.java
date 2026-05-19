class Solution {
    public String addStrings(String num1, String num2) {
        int n = num1.length()-1;
        int m = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(n>=0 || m>=0 || carry>0){
            int n1 = (n>=0)?num1.charAt(n)-'0':0;
            int n2 = (m>=0)?num2.charAt(m)-'0':0;
            sb.append((n1+n2+carry)%10);
            carry = (n1+n2+carry)/10;
            n--;
            m--;
        }
        return sb.reverse().toString();
    }
}