class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer> st = new Stack<>();
        List<Integer> al = new ArrayList<>();
        for(int i:nums){
            int j = i;
            while(j!=0){
                st.push(j%10);
                j/=10;
            }
            while(!st.isEmpty()){
                al.add(st.pop());
            }
        }
        int[] arr = new int[al.size()];
        for (int j = 0; j < al.size(); j++) {
            arr[j] = al.get(j);
        }
        return arr;
    }
}