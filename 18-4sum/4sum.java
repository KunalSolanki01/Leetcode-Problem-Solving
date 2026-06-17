class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int l = j+1,h = n-1;
                while(l<h){
                    long sum = (long)nums[i]+nums[l]+nums[h]+nums[j];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[l],nums[h],nums[j]));
                        l++;
                        h--;
                        while(l<h && nums[l]==nums[l-1]) l++;
                        while(l<h && nums[h]==nums[h+1]) h--;
                    }
                    else if(sum<target) l++;
                    else h--;
                }
            }
        }
        return ans;
    }
}