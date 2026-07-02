class Solution {
    public int maxDistinct(String s) {
        boolean []flag = new boolean[26];
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(!flag[s.charAt(i)-'a']){
                count++;
                flag[s.charAt(i)-'a'] = true;
            }
        }
        return count;
    }
}