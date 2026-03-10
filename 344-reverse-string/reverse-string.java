class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        int m = 0;
        while(n>m){
            s[m] = (char)(s[m]+s[n]);
            s[n] = (char)(s[m]-s[n]);
            s[m] = (char)(s[m]-s[n]);
            // char c = s[m];
            // s[m] = s[n];
            // s[n] = c;
            m++;
            n--;
        }
    }
}