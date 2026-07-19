class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        char[] ch = s.toCharArray();
        long shiftSum =0;
        for(int i = shifts.length-1; i >=0 ; i--){
            shiftSum  += shifts[i];
            ch[i] = (char)('a' + (ch[i] -'a' + shiftSum) % 26);
        }
        return new String(ch);
        // int n = shifts.length;
        // int[] arr = new int[n];
        // long sum = 0;
        // for(int i=n-1;i>=0;i--){
        //     sum+=shifts[i];
        //     arr[i] = (int)(sum%26);
        // }
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<n;i++){
        //     int val = s.charAt(i)-'a';
        //     int newVal = (val+arr[i])%26;
        //     sb.append((char)('a'+newVal));
        // }
        // return sb.toString();
    }
}