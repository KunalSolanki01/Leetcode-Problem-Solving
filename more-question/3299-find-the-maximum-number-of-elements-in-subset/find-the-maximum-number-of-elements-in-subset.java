class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }
        int maxLen = 1;
        if (map.containsKey(1L)) {
            int count = map.get(1L);
            maxLen = (count % 2 == 0) ? count - 1 : count;
        }
        for (long x : map.keySet()) {
            if (x == 1)
                continue;
            int currentLen = 0;
            long current = x;
            while (map.containsKey(current) && map.get(current) >= 2) {
                currentLen += 2;
                current = current * current;
                if (current > 1_000_000_000)
                    break;
            }
            if (map.containsKey(current)) {
                currentLen += 1;
            } else {
                currentLen -= 1;
            }
            maxLen = Math.max(maxLen, currentLen);
        }
        return maxLen;
    }
}
