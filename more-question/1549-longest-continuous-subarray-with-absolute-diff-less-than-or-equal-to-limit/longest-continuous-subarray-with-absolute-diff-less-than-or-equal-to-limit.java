class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> minDq = new ArrayDeque<>();
        Deque<Integer> maxDq = new ArrayDeque<>();
        int i=0,j=0,n=nums.length;
        int max = 0;
        while(i<n && j<n){
            while(!maxDq.isEmpty() && maxDq.peekLast()<nums[i]) maxDq.pollLast();
            maxDq.addLast(nums[i]);
            while(!minDq.isEmpty() && minDq.peekLast()>nums[i]) minDq.pollLast();
            minDq.addLast(nums[i]);
            while(Math.abs(minDq.peekFirst()-maxDq.peekFirst())>limit){
                if(minDq.peekFirst()==nums[j]){
                    minDq.pollFirst();
                }
                if(maxDq.peekFirst()==nums[j]){
                    maxDq.pollFirst();
                }
                j++;
            }
            max = Math.max(max,i-j+1);
            i++;
        }
        return max;
    }
}