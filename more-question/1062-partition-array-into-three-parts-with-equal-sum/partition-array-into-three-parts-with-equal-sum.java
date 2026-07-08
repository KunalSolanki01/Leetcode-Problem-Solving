class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i:arr) sum+=i;
        if(sum%3!=0) return false;
        int count = 0;
        int target = sum/3;
        int cur = 0;
        for(int i:arr){
            cur+=i;
            if(cur==target){
                count++;
                cur=0;
            }
        }
        return count>=3;
    }
}