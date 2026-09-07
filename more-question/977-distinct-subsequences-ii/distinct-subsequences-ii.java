class Solution {
    public int distinctSubseqII(String s) {
        final long MOD = 1_000_000_007L;
        long[] dp = new long[26];
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            long total = 0;
            for (long count : dp) {
                total = (total + count) % MOD;
            }
            dp[idx] = (total + 1) % MOD;
        }
        long answer = 0;
        for (long count : dp) {
            answer = (answer + count) % MOD;
        }
        return (int) answer;
    }
}