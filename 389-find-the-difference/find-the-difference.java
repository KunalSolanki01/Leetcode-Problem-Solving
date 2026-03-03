class Solution {
    public char findTheDifference(String s, String t) {
        char []sc = s.toCharArray();
        char []tc = t.toCharArray();
        int ss = 0,ts = 0;
        for(char c:sc) ss+=c;
        for(char c:tc) ts+=c;
        return (char)(ts-ss);
    }
}