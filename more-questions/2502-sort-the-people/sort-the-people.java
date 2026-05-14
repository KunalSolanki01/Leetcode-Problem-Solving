class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] arr = new String[n];
        Integer []idx = new Integer[n];
        for(int i=0;i<n;i++){
            idx[i]=i;
        }
        Arrays.sort(idx,(a,b)->heights[b]-heights[a]);
        for(int i=0;i<n;i++){
            arr[i] = names[idx[i]];
        }
        return arr;
    }
}