class Solution {
    public String[] createGrid(int m, int n) {
        String []ans = new String[m];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(".");
        }
        ans[0] = sb.toString();
        for(int i=1;i<m;i++){
            StringBuilder temp = new StringBuilder();
            for(int j=0;j<n-1;j++){
                temp.append("#");
            }
            temp.append(".");
            ans[i] = temp.toString();
        }
        return ans;
    }
}