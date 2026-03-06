class Solution {
    public boolean checkOnesSegment(String s) {
        if(!s.contains("0")) return true; 
        int zero = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero = i;
                break;
            }
        }
        for(int i=zero+1;i<s.length();i++){
            if(s.charAt(i)=='1') return false;
        }
        return true;
    }
}