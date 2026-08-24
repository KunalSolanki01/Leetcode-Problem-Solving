class Solution {
    public int maxVowels(String s, int k) {
        int max = -1;
        int count = 0;
        for(int i=0;i<s.length() && i<k;i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') count++;
        }
        max = Math.max(max,count);
        for(int i=k;i<s.length();i++){
            int j = i-k;
            char c = s.charAt(i);
            char c1 = s.charAt(j);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') count++;
            if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u') count--;
            max = Math.max(max,count);
        }
        return max;
    }
}