class Solution {
    // public boolean check(int x,int k){
    //     if(x==1) return true;
    //     while(x%k==0){
    //         x/=k;
    //     }
    //     return x==1;
    // }
    public int countKthRoots(int l, int r, int k) {
        int count = 0;
        if(k==1) return r-l+1;
        for(int i=0;i<=r;i++){
            if(Math.pow(i,k)>r) break;
            if(Math.pow(i,k)>=l) count++;
        }
        return count;
    }
}