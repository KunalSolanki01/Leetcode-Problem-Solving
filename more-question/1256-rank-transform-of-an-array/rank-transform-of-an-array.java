class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        int idx = 1;
        for(int i:temp){
            if(!map.containsKey(i)){
                map.put(i,idx);
                idx++;
            }
        }
        for(int i=0;i<arr.length;i++){
            temp[i] = map.get(arr[i]);
        }
        return temp;
    }
}