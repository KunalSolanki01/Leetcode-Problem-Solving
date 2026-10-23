class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, Integer> map = new HashMap<>();
        int idx = 0;
        for(List<String> x: equations){
            for(String y:x){
                if(!map.containsKey(y)) map.put(y,idx++);
            }
        }
        int n = idx;
        double[][] div = new double[n][n];
        for(int i=0;i<n;i++) div[i][i] = 1.0;
        for(int i=0;i<equations.size();i++){
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            int u = map.get(a), v = map.get(b);
            div[u][v] = values[i];
            div[v][u] = 1.0/values[i];
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(div[i][j]==0){
                        div[i][j] = div[i][k]*div[k][j];
                    }
                }
            }
        }
        double[] ans = new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String a = queries.get(i).get(0);
            String b = queries.get(i).get(1);
            if(!map.containsKey(a) || !map.containsKey(b)) ans[i] = -1;
            else{
                double val = div[map.get(a)][map.get(b)];
                ans[i] = val==0?-1:val;
            }
        }
        return ans;
    }
}