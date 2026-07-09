class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]>0) st.push(arr[i]);
            else{
                boolean flag = false;
                while(!st.isEmpty() && st.peek()>0 && arr[i]<0){
                    if(Math.abs(st.peek())<Math.abs(arr[i])){
                        st.pop();
                        continue;
                    }
                    else if(st.peek()==Math.abs(arr[i])) st.pop();
                    flag = true;
                    break;
                }
                if(!flag) st.push(arr[i]);
            }
        }
        int []ans = new int[st.size()];
        for(int i=ans.length-1;i>=0;i--) ans[i] = st.pop();
        return ans;
    }
}