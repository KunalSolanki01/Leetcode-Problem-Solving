class MyCircularDeque {
    // int[] arr;
    // int rear,front;
    Deque<Integer> dq;
    int len;
    public MyCircularDeque(int k) {
        // this.arr = new int[k];
        // rear = -1;
        // front = -1;
        dq = new ArrayDeque<>();
        len = k;
    }
    
    public boolean insertFront(int value) {
        if(dq.size()!=len){
            dq.addFirst(value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(dq.size()!=len){
            dq.addLast(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(!dq.isEmpty()){
            dq.pollFirst();
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(!dq.isEmpty()){
            dq.pollLast();
            return true;
        }
        return false;
    }
    
    public int getFront() {
        if(!dq.isEmpty()) return dq.peekFirst();
        return -1;
    }
    
    public int getRear() {
        if(!dq.isEmpty()) return dq.peekLast();
        return -1;
    }
    
    public boolean isEmpty() {
        return dq.isEmpty();
    }
    
    public boolean isFull() {
        return dq.size()==len;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */