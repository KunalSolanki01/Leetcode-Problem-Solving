class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int n = 0;
        int m = 0;
        while(n<word1.length() || m<word2.length()){
            if(n<word1.length()) res=res+word1.charAt(n);
            if(m<word2.length()) res=res+word2.charAt(m);
            n++;
            m++;
        }
        return res;
    }
}