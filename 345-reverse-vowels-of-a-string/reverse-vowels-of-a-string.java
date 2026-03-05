class Solution {
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        List<Character> ls = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))) ls.add(s.charAt(i));
        }
        int j=ls.size()-1;
        for(int i=0;i<sb.length();i++){
            if(isVowel(sb.charAt(i))){
                sb.setCharAt(i,ls.get(j));
                j--;
            }
        }
        return sb.toString();
    }
}