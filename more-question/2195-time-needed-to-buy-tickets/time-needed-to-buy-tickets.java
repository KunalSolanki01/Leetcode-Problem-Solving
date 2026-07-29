class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        int n = tickets.length;
        for(int i=0;i<n;i++){
            // q.add(tickets[(i+k)%(n-1)]);
            q.add(i);
        }
        int count = 1;
        int target = tickets[k];
        while(q.size()!=0){
            int val = q.poll();
            tickets[val]--;
            if(val==k && tickets[val]==0) return count;
            if(tickets[val]!=0) q.add(val);
            count++;
        }
        return count;
    }
}