class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []arr = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        map.forEach((key,value)->{
            pq.add(new int[]{key,value});
        });
        for(int i=0;i<k;i++){
            int []p = pq.poll();
            arr[i] = p[0];
        }
        return arr;
    }
}