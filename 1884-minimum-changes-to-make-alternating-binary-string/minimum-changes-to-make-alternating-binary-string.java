class Solution {
    public int minOperations(String s) {
        int c1 = 0;
        int c0 = 0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1') c0++;
                else c1++;
            }
            else{
                if(s.charAt(i)=='1') c1++;
                else c0++;
            }
        }
        return Math.min(c1,c0);
    }
}