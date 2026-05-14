class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> ls = new ArrayList<>();
        int j=0;
        ls.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=ls.get(j)[1]){
                ls.get(j)[1] = Math.max(ls.get(j)[1],intervals[i][1]);
            }
            else{
                ls.add(intervals[i]);
                j++;
            }
        }
        return ls.toArray(new int[j][]);
    }
}