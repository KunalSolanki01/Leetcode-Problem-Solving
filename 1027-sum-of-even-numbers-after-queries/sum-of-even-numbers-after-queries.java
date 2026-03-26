class Solution {
    // public int even(int[] arr){
    //     int sum = 0;
    //     for(int i:arr){
    //         if(i%2==0) sum+=i;
    //     }
    //     return sum;
    // }
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] arr = new int[queries.length];
        int even = 0;
        for(int i:nums){
            if(i%2==0) even+=i;
        }
        for(int i=0;i<queries.length;i++){
            int idx = queries[i][1];
            int val = queries[i][0];
            if(nums[idx]%2==0) even-=nums[idx];
            nums[idx]+=val;
            if(nums[idx]%2==0) even+=nums[idx];
            arr[i] = even;
        }
        return arr;
        // for(int i=0;i<queries.length;i++){
        //     int idx = queries[i][1];
        //     nums[idx]+=queries[i][0];
        //     arr[i] = even(nums);
        // }
        // return arr;
    }
}