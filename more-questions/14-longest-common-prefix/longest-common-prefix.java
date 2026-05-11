class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int n = strs.length;
        char temp;
        int idx = 0;
        while(true){
            if(strs[0].length()>idx) temp=strs[0].charAt(idx);
            else break;

            for(int j=1;j<n;j++){
                if(idx>=strs[j].length() || strs[j].charAt(idx)!=temp) return sb.toString();

            }
            idx++;
            sb.append(temp);
        }
        return sb.toString();
    }
}