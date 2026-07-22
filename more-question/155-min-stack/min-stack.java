class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;
    public MinStack() {
        this.st = new Stack<>();
        this.min = new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push(value);
            min.push(value);
        }
        else if(value<=min.peek()){
            st.push(value);
            min.push(value);
        }
        else st.push(value);
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        if(st.peek()<=min.peek()){
            st.pop();
            min.pop();
        }
        else st.pop();
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek();
    }
    
    public int getMin() {
        if(st.isEmpty()) return -1;
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */