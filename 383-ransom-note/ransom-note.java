class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []freq1 = new int[26];
        int []freq2 = new int[26];
        for(char c:ransomNote.toCharArray()){
            freq1[c-'a']++;
        }
        for(char c:magazine.toCharArray()){
            freq2[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq2[i]<freq1[i]) return false;
        }
        return true;
        // String reversed = new StringBuilder(ransomNote).reverse().toString();
        // return magazine.contains(ransomNote) || magazine.contains(reversed);
    }
}