class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        map.forEach((k,v)->{
            if(v>1) ans.add(k);
        });
        return ans;
    }
}