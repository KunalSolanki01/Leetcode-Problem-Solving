class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int mx = 0;
        for(int i=0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
        }
        mx*=2;
        boolean[] st = new boolean[mx];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                st[nums[i]^nums[j]] = true;
            }
        }
        int[] s = new int[mx];
        for (int i=0;i<mx;i++){
            if(st[i]){
                for(int j=0;j<nums.length;j++){
                    s[i^nums[j]]=1;
                }
            }
        }
        int res = 0;
        for(int i=0;i<mx;i++){
            res+=s[i];
        }
        return res;
    }
}