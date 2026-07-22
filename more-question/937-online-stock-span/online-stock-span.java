class StockSpanner {
    private Stack<int[]> st;
    private int day;
    public StockSpanner() {
        this.st = new Stack<>();
        this.day = 0;
    }
    
    public int next(int price) {
        this.day++;
        while(!st.isEmpty() && st.peek()[0]<=price) st.pop();
        int last = 0;
        if(!st.isEmpty()) last = st.peek()[1];
        st.push(new int[]{price,day});
        return day-last;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */