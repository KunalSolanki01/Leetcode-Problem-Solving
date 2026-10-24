class Solution {
    int []par = new int[26];
    public boolean equationsPossible(String[] eq) {
        int n = eq.length;
        for(int i=0;i<26;i++) par[i] = i;
        for(int i=0;i<n;i++){
            String temp = eq[i];
            if(temp.charAt(1)=='=') union(temp.charAt(0)-'a', temp.charAt(3)-'a');
        }
        for(int i=0;i<n;i++){
            String temp = eq[i];
            if(temp.charAt(1)=='!'){
                int x = find(temp.charAt(0)-'a');
                int y = find(temp.charAt(3)-'a');
                if(x==y) return false;
            }
        }
        return true;
    }
    int find(int x){
        if(par[x]==x) return x;
        return par[x] = find(par[x]);
    }
    void union(int x,int y){
        int a = find(x);
        int b = find(y);
        if(a==b) return;
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        par[b] = a;
    }
}