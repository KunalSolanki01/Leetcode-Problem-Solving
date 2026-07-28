class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        int n = deck.length;
        int []ans = new int[n];
        for(int i=0;i<n;i++){
            q.add(i);
        }
        for(int i=0;i<n;i++){
            if(!q.isEmpty()){
                ans[q.peek()] = deck[i];
                q.poll();
                q.add(q.peek());
                q.poll();
            }
        }
        return ans;
    }
}