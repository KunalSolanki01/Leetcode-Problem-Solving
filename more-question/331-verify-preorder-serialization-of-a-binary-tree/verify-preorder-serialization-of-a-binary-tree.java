class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> st = new Stack<>();
        st.push("-1");
        String []arr = preorder.split(",");
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()) return false;
            if(arr[i].equals("#")) st.pop();
            else st.push(arr[i]);
        }
        return st.isEmpty();
    }
}