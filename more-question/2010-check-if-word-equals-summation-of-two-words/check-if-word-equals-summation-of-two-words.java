class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int val1 = 0,val2=0,val3=0;
        for(char c: firstWord.toCharArray()){
            val1*=10;
            val1+=c-'a';
        }
        for(char c: secondWord.toCharArray()){
            val2*=10;
            val2+=c-'a';
        }
        for(char c: targetWord.toCharArray()){
            val3*=10;
            val3+=c-'a';
        }
        return val1+val2==val3;
    }
}