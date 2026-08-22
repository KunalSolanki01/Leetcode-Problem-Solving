// class Solution {
//     // public boolean valid(String s){
//     //     int freq[] = new int[256];
//     //     for(char c:s.toCharArray()){
//     //         if(freq[c]>0) return false;
//     //         freq[c]++;
//     //     }
//     //     return true;
//     // }
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int max = 0;
//         int i=0;
//         int freq[] = new int[256];
//         for(int j=0;j<n;j++){
//             char c = s.charAt(j);
//             while(freq[c]>0){
//                 freq[s.charAt(i)]--;
//                 i++;
//             }
//             freq[c]++;
//             max = Math.max(j-i+1,max);
//         }
//         // while(i<=j){
//         //     if(valid(s.substring(i,j))){
//         //         max = Math.max(max,j-i+1);
//         //         i++;
//         //         j=n;
//         //     }
//         //     else j--;
//         // }
//         return max;
//     }
// }
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;    
        for (int r = 0; r < n; r++) {
            char temp = s.charAt(r);
            if (map.containsKey(temp)) {
                l = Math.max(l, map.get(temp) + 1);
            }
            map.put(temp, r);
            ans = Math.max(ans, r- l+ 1);
        }    
        return ans;
    }
}