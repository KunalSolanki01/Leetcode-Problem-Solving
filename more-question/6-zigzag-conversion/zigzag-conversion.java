class Solution {
    public String convert(String s, int row) {
        int n = s.length();
        if(row==1){
            return s;
        }
        String[] arr = new String[row];
        Arrays.fill(arr,"");
        boolean fwd = false;
        int idx = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            arr[idx]+=c;
            if(idx==0 || idx==row-1) fwd=!fwd;
            idx+=(fwd?+1:-1);
        }
        String ans = "";
        for(String k:arr) ans+=k;
        return ans;
    }
}