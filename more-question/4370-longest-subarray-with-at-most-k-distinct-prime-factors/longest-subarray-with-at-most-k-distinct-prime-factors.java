class Solution {
    public Set<Integer> primeFact(int n) {
        Set<Integer> set = new HashSet<>();
        int d = 2;
        while (d * d <= n) {
            if (n % d == 0) {
                set.add(d);
                while (n % d == 0)
                    n /= d;
            }
            d++;
        }
        if (n > 1)
            set.add(n);
        return set;
    }

    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        List<Set<Integer>> ls = new ArrayList<>();
        for (int x : nums)
            ls.add(primeFact(x));
        int l = 0, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int y : ls.get(i))
                map.put(y, map.getOrDefault(y, 0) + 1);
            while (map.size() > k) {
                for (int z : ls.get(l)) {
                    if (map.get(z) == 1)
                        map.remove(z);
                    else
                        map.put(z, map.get(z) - 1);
                }
                l++;
            }
            max = Math.max(max, i-l+1);
        }
        return max;
    }
}