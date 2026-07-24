class Solution {
    public int totalMoney(int n) {
        int sum = 1;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(i>0 && i%7==0) sum++;
            ans+=sum+(i%7);
        }
        return ans;
    }
}