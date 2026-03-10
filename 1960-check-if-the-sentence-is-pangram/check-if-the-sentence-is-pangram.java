class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        int[] letter = new int[26];
        for(int i=0;i<sentence.length();i++){
            letter[sentence.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(letter[i]==0) return false;
        }
        return true;
    }
}