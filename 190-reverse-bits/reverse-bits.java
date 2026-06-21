class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(0));
        while(n>=0){
            sb.append(String.valueOf(n%2));
            n/=2;
            if(n==0) break;
        }
        int x = sb.length();
        for(int i=x;i<32;i++) sb.append(String.valueOf(0));
        System.out.println(sb);
        long ans = 0;
        for(int i=sb.length()-1;i>=0;i--){
            ans+=(int)((sb.charAt(i)-'0')*Math.pow(2,sb.length()-i));
        }
        return (int)ans;
    }
}