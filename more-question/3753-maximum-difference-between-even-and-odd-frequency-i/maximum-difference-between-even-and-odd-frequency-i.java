class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int evMin = 101;
        int odMin = 101;
        int evMax = 0;
        int odMax = 0;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                if(freq[i]%2==0){
                    evMin = Math.min(evMin,freq[i]);
                    evMax = Math.max(evMax,freq[i]);
                }
                else{
                    odMin = Math.min(odMin,freq[i]);
                    odMax = Math.max(odMax,freq[i]);
                }
            }
        }
        return Math.max((odMax-evMin),(odMin-evMax));
    }
}