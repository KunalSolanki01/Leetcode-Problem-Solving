class Solution {
    public int[] validSequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] last = new int[m + 1];
        Arrays.fill(last, -1);
        last[m] = n;
        int j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (j >= 0 && s.charAt(i) == t.charAt(j)) {
                last[j] = i;
                j--;
            }
        }
        int[] ans = new int[m];
        int k = 0;
        j = 0;
        boolean used = false;
        for (int i = 0; i < n && j < m; i++) {
            if (s.charAt(i) == t.charAt(j)) {
                ans[k++] = i;
                j++;
            } else if (!used && last[j + 1] > i) {
                ans[k++] = i;
                j++;
                used = true;
            }
        }
        if (j == m) {
            return ans;
        }
        return new int[0];
    }
}