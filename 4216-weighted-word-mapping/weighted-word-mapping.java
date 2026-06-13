class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        int n = words.length;
        for(String word : words){
            int sum = 0;
            for(char ch : word.toCharArray()) sum+=weights[ch - 'a'];
            int modulo = sum % 26;
            ans.append((char)('z'- modulo));
        }
        return ans.toString();
    }
}