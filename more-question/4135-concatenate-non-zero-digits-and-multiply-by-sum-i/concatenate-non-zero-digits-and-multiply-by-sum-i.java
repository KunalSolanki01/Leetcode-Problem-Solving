class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        long i=1;
        while(n>0){
            int m=n % 10;
            n /=10;
            if(m == 0) continue;
            sum += m;
            x += (m * i);
            i *=10;
        }
        return x * sum;
    }
}