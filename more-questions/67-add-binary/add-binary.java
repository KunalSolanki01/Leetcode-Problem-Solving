class Solution {
    public String addBinary(String num1, String num2) {
        int n = num1.length()-1;
        int m = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(n>=0 || m>=0 || carry>0){
            int n1 = (n>=0)?num1.charAt(n)-'0':0;
            int n2 = (m>=0)?num2.charAt(m)-'0':0;
            int sum = n1+n2+carry;
            if(carry==1) carry=0;
            if(sum==0) sb.append(0);
            if(sum==1) sb.append(1);
            if(sum==2){
                sb.append(0);
                carry=1;
            }
            if(sum==3){
                sb.append(1);
                carry=1;
            }
            n--;
            m--;
        }
        return sb.reverse().toString();
    }
}