class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int gap = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' '){
                gap++;
            }
            if(gap==k) break;
            sb.append(c);
        }
        return sb.toString();
    }
}