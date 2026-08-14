class Solution {
    public int maximumLengthSubstring(String s) {
        int[] a= new int[26];
        int mx = 0;
        int j = 0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
            while(a[s.charAt(i)-'a']>2){
                a[s.charAt(j)-'a']--;
                j++;
            }
            mx= Math.max(mx,i-j+1);
        }
        return mx;
    }
}