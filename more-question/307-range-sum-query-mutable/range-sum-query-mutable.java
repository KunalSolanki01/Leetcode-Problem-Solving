class NumArray {
    int []tree;
    int []nums;
    int n;
    public NumArray(int[] nums) {
        this.n=nums.length;
        this.nums = new int[n];
        this.tree = new int[n+1];
        for(int i=0;i<n;i++) update(i,nums[i]);
    }
    
    public void update(int index, int val) {
        int delta = val - nums[index];
        nums[index] = val;
        for(int i=index+1;i<=n;i+=i&-i) tree[i]+=delta;
    }
    public int query(int i){
        int sum=0;
        i=i+1;
        for(;i>0;i-=i&-i) sum+=tree[i];
        return sum;
    }
    public int sumRange(int left, int right) {
        return query(right)-query(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */