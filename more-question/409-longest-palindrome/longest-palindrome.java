class Solution {
    public int longestPalindrome(String s) {
        int []freq = new int[256];
        for(char c:s.toCharArray()) freq[c]++;
        int max = 0;
        boolean flag = false;
        for(int i:freq){
            max+=(i/2)*2;
            if(i%2!=0) flag = true;
        }
        if(flag) max+=1;
        return max;
    }
}