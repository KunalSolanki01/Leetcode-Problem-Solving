class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int ans = 10;
        int s1 = 9;
        int s2 = 9;
        for(int i=2;i<=n;i++){
            s1*=s2;
            ans+=s1;
            s2--;
        }
        return ans;
    }
}