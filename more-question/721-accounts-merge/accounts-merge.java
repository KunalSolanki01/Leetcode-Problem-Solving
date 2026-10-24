class Solution {
    int []par;
    int find(int x){
        if(x==par[x]) return x;
        return par[x]= find(par[x]);
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
    public List<List<String>> accountsMerge(List<List<String>> acc) {
        Map<String, Integer> etou = new HashMap<>();
        int n = acc.size();
        par = new int[n];
        for(int i=0;i<n;i++) par[i] = i;
        for(int i=0;i<n;i++){
            for(int j=1;j<acc.get(i).size();j++){
                String temp = acc.get(i).get(j);
                if(etou.containsKey(temp)) union(i,etou.get(temp));
                else etou.put(temp,i);
            }
        }
        Map<Integer,TreeSet<String>> merge = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = find(i);
            merge.putIfAbsent(x,new TreeSet<>());
            for(int j=1;j<acc.get(i).size();j++){
                merge.get(x).add(acc.get(i).get(j));
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(int x:merge.keySet()){
            List<String> temp = new ArrayList<>();
            temp.add(acc.get(x).get(0));
            temp.addAll(merge.get(x));
            ans.add(temp);
        }
        return ans;
    }
}