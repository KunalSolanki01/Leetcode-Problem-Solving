class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean []flag = new boolean[n+1];
        int i=2;
        while(i*i<n){
            if(!flag[i]){
                for(int j=i*i;j<n;j+=i){
                    flag[j] = true;
                }
            }
            i++;
        }
        int count = 0;
        for(boolean ch:flag) if(ch) count++;
        return n-count-2;
    }
}