class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        boolean a = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (!a) {
                    sb.append(s.substring(i + 1, n));
                    sb.append(" ");
                    a = true;
                }
                n = i;
            } else {
                a = false;
            }
        }
        if (!a) {
            sb.append(s.substring(0, n));
        }
        return sb.toString();
    }
}