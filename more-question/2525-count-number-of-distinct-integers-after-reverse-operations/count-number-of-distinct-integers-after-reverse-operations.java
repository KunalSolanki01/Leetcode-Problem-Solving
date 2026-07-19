class Solution {
    public int countDistinctIntegers(int[] nums) {
        boolean[] c = new boolean[1000001];
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(!c[nums[i]]){
                cnt++;
                c[nums[i]]=true;
            }
            int r = 0;
            int n = nums[i];
            while(n!=0){
                r = (r*10)+n%10;
                n/=10;
            }
            if(!c[r]){
                cnt++;
                c[r]=true;
            }
        }
        return cnt;
    }
}