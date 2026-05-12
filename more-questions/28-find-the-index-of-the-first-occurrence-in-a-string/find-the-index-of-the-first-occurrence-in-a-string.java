class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        // if(n>h) return -1;    // m1
        // for(int i=0;i<=h-n;i++){
        //     int j=0;
        //     while(j<n && haystack.charAt(i+j)==needle.charAt(j)) j++;
        //     if(j==n) return i;
        // }
        // return -1;
// return haystack.indexOf(needle);   // m2

        for(int i = 0, j = n; j<=h; i++,j++){   // m3
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}