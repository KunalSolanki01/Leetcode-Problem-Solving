class Solution {
    // public boolean valid(String s){
    //     int freq[] = new int[256];
    //     for(char c:s.toCharArray()){
    //         if(freq[c]>0) return false;
    //         freq[c]++;
    //     }
    //     return true;
    // }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int i=0;
        int freq[] = new int[256];
        for(int j=0;j<n;j++){
            char c = s.charAt(j);
            while(freq[c]>0){
                freq[s.charAt(i)]--;
                i++;
            }
            freq[c]++;
            max = Math.max(j-i+1,max);
        }
        // while(i<=j){
        //     if(valid(s.substring(i,j))){
        //         max = Math.max(max,j-i+1);
        //         i++;
        //         j=n;
        //     }
        //     else j--;
        // }
        return max;
    }
}