class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = n*n;
        int even = n*(n+1);
        if(n==1) return 1;
        for(int i=n;i>1;i--){
            if(odd%i==0 && even%i==0) return i; 
        }
        return -1;
    }
}