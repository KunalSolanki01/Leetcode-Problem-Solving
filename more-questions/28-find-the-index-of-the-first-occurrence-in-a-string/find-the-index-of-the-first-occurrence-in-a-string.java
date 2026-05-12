class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        // if(h==n && h==1 && haystack.charAt(0)==needle.charAt(0)) return 0; 
        if(n>h) return -1;
        for(int i=0;i<=h-n;i++){
            int j=0;
            while(j<n && haystack.charAt(i+j)==needle.charAt(j)) j++;
            if(j==n) return i;
        }
        return -1;
    }
}