class Solution {
    public int compress(char[] chars) {
        if(chars.length<2) return chars.length;
        int count = 0;
        int i = 0;
        int n = chars.length;
        while(i<n){
            char ch = chars[i];
            int cnt = 0;
            while(i<n && chars[i]==ch){
                i++;
                cnt++;
            }
            chars[count++] = ch;
            // count++;
            if(cnt>1){
                String cntStr = String.valueOf(cnt);
                for(char c: cntStr.toCharArray()) chars[count++] = c;
            }

        }
        // System.out.println(count);
        return count;
    }
}