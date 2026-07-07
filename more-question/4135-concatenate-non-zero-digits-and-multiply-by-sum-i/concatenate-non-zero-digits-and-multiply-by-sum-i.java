class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        long sum = 0;
        String s = String.valueOf(n);
        for(char c:s.toCharArray()){
            int val = c-'0';
            if(val==0) continue;
            sum+=val;
            ans = ans*10+val;
        }
        return ans*sum;
    }
}