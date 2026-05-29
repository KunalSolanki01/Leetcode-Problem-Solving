class Solution {
    public int arrangeCoins(int n) {
        long l = 0,h = n;
        while(l<=h){
            long m = l+(h-l)/2;
            long t = (m*(m+1))/2;
            if(n==t) return (int)m;
            else if(n<t) h = m-1;
            else l = m+1;
        }
        return (int)h;
    }
}