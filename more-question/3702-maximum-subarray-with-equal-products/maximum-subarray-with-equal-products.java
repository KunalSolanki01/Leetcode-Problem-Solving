class Solution {
    public int maxLength(int[] a) {
        int n = a.length, ans = 0;

        for (int i = 0; i < n; i++) {
            long p = 1, g = 0, l = 1;

            for (int j = i; j < n; j++) {
                p *= a[j];
                g = gcd(g, a[j]);
                l = (l / gcd(l, a[j])) * a[j];

                if (p == g * l)
                    ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }

    public long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}