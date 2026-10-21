class Solution {
    public List<Integer> diffWaysToCompute(String s) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='+' || c=='-' || c=='*'){
                List<Integer> l = diffWaysToCompute(s.substring(0,i));
                List<Integer> r = diffWaysToCompute(s.substring(i+1,n));
                for(int x:l){
                    for(int y:r){
                        if(c=='+') ans.add(x+y);
                        if(c=='-') ans.add(x-y);
                        if(c=='*') ans.add(x*y);
                    }
                }
            }
        }
        if(ans.size()==0) ans.add(Integer.parseInt(s));
        return ans;
    }
}