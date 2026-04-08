class Solution {
    public int reverse(int x) {
        int a = x;
        long rev = 0;
        while(a!=0){
            rev = rev*10 + (a%10);
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
            a/=10;
        }
        return (int)rev;
    }
}