class Solution {
    public int totalNumbers(int[] digits) {
        int[] f = new int[10];
        for (int d : digits) f[d]++;
        int ans = 0;
        for (int i = 100; i <= 999; i += 2) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            f[a]--; f[b]--; f[c]--;
            if (f[a] >= 0 && f[b] >= 0 && f[c] >= 0) ans++;
            f[a]++; f[b]++; f[c]++;
        }
        return ans;
    }
}
