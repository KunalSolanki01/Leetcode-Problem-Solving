class Solution {
    public void reverseString(char[] s) {
        int n = s.length - 1;
        int m = 0;
        helper(s, m, n);
    }
    void helper(char[] s, int m, int n) {
        if (m >= n)
            return;
        s[m] = (char) (s[m] + s[n]);
        s[n] = (char) (s[m] - s[n]);
        s[m] = (char) (s[m] - s[n]);
        helper(s, m + 1, n - 1);
    }
}
