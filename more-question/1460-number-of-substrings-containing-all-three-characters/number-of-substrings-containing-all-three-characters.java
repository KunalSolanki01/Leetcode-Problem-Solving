class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int l = 0;
        int []count = {0,0,0};
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            while(count[0]>0 && count[1]>0 && count[2]>0){
                ans+=(s.length()-i);
                count[s.charAt(l)-'a']--;
                l++;
            }
        }
        return ans;
    }
}