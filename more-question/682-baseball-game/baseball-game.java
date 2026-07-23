class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s:operations){
            if(s.equals("D")){
                if(!st.isEmpty()) st.push(st.peek()*2);
            }
            else if(s.equals("C")){
                if(!st.isEmpty()) st.pop();
            }
            else if(s.equals("+")){
                if(st.size()>1){
                    int val = st.get(st.size()-2)+st.peek();
                    st.push(val);
                }
            }
            else st.push(Integer.parseInt(s));
        }
        int sum = 0;
        // for(int i:st) sum+=i;
        while(!st.isEmpty()) sum+=st.pop();
        return sum;
    }
}