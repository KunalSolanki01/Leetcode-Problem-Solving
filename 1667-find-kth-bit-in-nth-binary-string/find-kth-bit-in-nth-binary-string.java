class Solution {
    public String reverseS(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0') sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }
    public String traverse(int n){
        if(n==1) return "0";
        String ac = traverse(n-1);
        return ac+"1"+reverseS(ac);
    }
    public char findKthBit(int n, int k) {
        if(k==1) return '0';
        String s1 = traverse(n);
        return s1.charAt(k-1);
    }
}