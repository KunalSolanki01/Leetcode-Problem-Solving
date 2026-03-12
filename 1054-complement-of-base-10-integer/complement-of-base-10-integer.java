class Solution {
    public int bitwiseComplement(int n) {
        String bn = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(char c:bn.toCharArray()){
            if(c =='1') sb.append('0');
            else sb.append('1');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}