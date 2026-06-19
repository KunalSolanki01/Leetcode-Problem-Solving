class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int s = nums[i];
            while(i+1<n && nums[i]+1==nums[i+1]) i++;
            if(s==nums[i]) ans.add(String.valueOf(nums[i]));
            else ans.add(s+"->"+nums[i]);
        }
        return ans;
    }
}