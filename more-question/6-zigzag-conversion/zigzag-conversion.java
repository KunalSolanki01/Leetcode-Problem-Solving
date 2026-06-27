class Solution {
    public String convert(String s, int row) {
        int n = s.length();
        if(row==1){
            return s;
        }
        String[] arr = new String[row];
        Arrays.fill(arr,"");
        boolean fwd = true;
        int idx = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(fwd){
                arr[idx++]+=c;
                if(idx==row){
                    idx=row-2;
                    fwd = false;
                }
            }else{
                arr[idx--]+=c;
                if(idx==-1){
                    idx = 1;
                    fwd = true;
                }
            }
        }
        String ans = "";
        for(String k:arr) ans+=k;
        return ans;
    }
}