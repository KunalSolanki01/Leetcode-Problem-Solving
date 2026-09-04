class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        var set = new HashSet<String>(wordDict);
        var flag = new boolean[s.length() + 1];
        flag[0] = true;

        for (var i = 1; i <= s.length(); i++) {
            for (var j = 0; j < i; j++) {
                if (flag[j] && set.contains(s.substring(j, i))) {
                    flag[i] = true;
                    break;
                }
            }
        }

        return flag[s.length()];
    }
}