class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        int n = s.length();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') st.push(i);
            else{
                if(st.isEmpty()) continue;
                arr[i] = 1;
                arr[st.pop()] = 1;
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1) sum++;
            else sum = 0;
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}