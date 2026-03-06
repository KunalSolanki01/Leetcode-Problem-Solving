class Solution {
    public int firstUniqChar(String s) {
        int []arr =new int[26];
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i)-'a';
            arr[a]+=1;
        }
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i)-'a';
            if(arr[a]==1) return i;
        }
        return -1;
    }
}