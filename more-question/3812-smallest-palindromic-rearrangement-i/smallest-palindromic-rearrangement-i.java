class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        int n = s.length();
        if(n==1) return s;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        int oddCount = 0;
        int oddIndex = -1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                oddIndex = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]/2>0){
                char c = (char)(i+'a');
                for(int j=0;j<freq[i]/2;j++){
                    sb.append(c);
                }
            }
        }
        String ans = new String();
        if(oddIndex != -1) {
            char mid = (char) (oddIndex + 'a');
            ans = sb.toString()+mid+sb.reverse().toString();
        }else ans = sb.toString()+sb.reverse().toString();
        return ans;
    }
}