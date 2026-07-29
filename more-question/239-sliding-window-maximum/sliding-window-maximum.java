class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int idx = 0;
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekLast()<nums[i]) dq.pollLast();
            dq.addLast(nums[i]);
            if(i>=k-1){
                ans[idx++] = dq.peekFirst();
            }
            if(i-k+1>=0 && dq.peekFirst()==nums[i-k+1]) dq.pollFirst();
        }
        return ans;
    }
}