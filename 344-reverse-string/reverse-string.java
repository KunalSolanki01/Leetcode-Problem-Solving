class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        int m = 0;
        while(n>=m){
            char c = s[m];
            s[m] = s[n];
            s[n] = c;
            m++;
            n--;
        }
    }
}