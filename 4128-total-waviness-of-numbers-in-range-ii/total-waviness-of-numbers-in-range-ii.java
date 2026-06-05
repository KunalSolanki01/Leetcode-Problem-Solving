class Solution {
    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long n) {
        if (n < 100) return 0;
        String s = String.valueOf(n);
        int len = s.length();
        Long[][][][][][] memo = new Long[len][11][11][2][2][2];
        return count(s, 0, 10, 10, 0, 0, 1, memo);
    }

    private long count(String s, int idx, int prev, int pprev, int isLess, int started, int tight, Long[][][][][][] memo) {
        if (idx == s.length()) return 0;
        if (memo[idx][prev][pprev][isLess][started][tight] != null) 
            return memo[idx][prev][pprev][isLess][started][tight];

        long ans = 0;
        int limit = tight == 1 ? s.charAt(idx) - '0' : 9;

        for (int d = 0; d <= limit; d++) {
            int nextTight = (tight == 1 && d == limit) ? 1 : 0;
            int nextStarted = (started == 1 || d > 0) ? 1 : 0;
            
            int waviness = 0;
            if (started == 1 && pprev != 10) {
                if (prev > pprev && prev > d) waviness = 1;
                else if (prev < pprev && prev < d) waviness = 1;
            }

            if (waviness == 1) {
                ans += countNumbers(s, idx + 1, nextTight);
            }
            
            ans += count(s, idx + 1, d, (started == 1 ? prev : 10), isLess, nextStarted, nextTight, memo);
        }
        return memo[idx][prev][pprev][isLess][started][tight] = ans;
    }

    private long countNumbers(String s, int idx, int tight) {
        if (idx == s.length()) return 1;
        if (tight == 0) return (long) Math.pow(10, s.length() - idx);
        
        long count = 0;
        int limit = s.charAt(idx) - '0';
        for (int d = 0; d <= limit; d++) {
            count += countNumbers(s, idx + 1, (d == limit ? 1 : 0));
        }
        return count;
    }
}