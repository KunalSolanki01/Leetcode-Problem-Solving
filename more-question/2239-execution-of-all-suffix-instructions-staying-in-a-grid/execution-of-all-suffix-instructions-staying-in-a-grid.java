class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        int []arr = new int[len];
        for(int i=0;i<len;i++){
            int count =0;
            int a = startPos[0];
            int b = startPos[1];
            for(int j=i;j<len;j++){
                char c = s.charAt(j);
                if(c=='R') b++;
                else if(c=='L') b--;
                else if(c=='U') a--;
                else a++;
                if(a<0 || a>=n || b<0 || b>=n) break;
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}