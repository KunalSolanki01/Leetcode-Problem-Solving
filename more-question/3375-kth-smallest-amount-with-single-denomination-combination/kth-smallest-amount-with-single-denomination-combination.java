class Solution {
    long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    long dfs(int index, long currentLcm, int cnt, long x, int[] coins) {
        if (index == coins.length) {
            if (cnt == 0) return 0;   
            if (cnt % 2 == 1) return x / currentLcm;
            else return -(x / currentLcm);
        }
        long ans = dfs(index + 1, currentLcm, cnt, x, coins);
        long newLcm = lcm(currentLcm, coins[index]);
        if (newLcm <= x) {
            ans += dfs(index + 1, newLcm, cnt + 1, x, coins);
        }
        return ans;
    }

    long count(long x, int[] coins) {
        return dfs(0, 1, 0, x, coins);
    }

    public long findKthSmallest(int[] coins, int k) {
        long low = 1;
        long high = coins[0];
        for (int i : coins) high = Math.min(high, i);
        high *= k;
        while (low < high) {
            long mid = (low + high) / 2;
            if (count(mid, coins) >= k) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}