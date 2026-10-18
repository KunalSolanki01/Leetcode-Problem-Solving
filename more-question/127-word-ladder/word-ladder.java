class Solution {
    public int ladderLength(String st, String end, List<String> wordl) {
        Set<String> word = new HashSet<>(wordl);
        if (!word.contains(end))
            return 0;
        Queue<String> q = new ArrayDeque<>();
        q.add(st);
        word.remove(st);
        int ans = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                StringBuilder s = new StringBuilder(q.poll());
                if (s.toString().equals(end))
                    return ans;
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == c)
                            continue;
                        s.setCharAt(j, ch);
                        String nxt = s.toString();
                        if (word.contains(nxt)) {
                            q.add(nxt);
                            word.remove(nxt);
                        }

                    }
                    s.setCharAt(j, c);
                }
            }
            ans++;
        }
        return 0;
    }
}