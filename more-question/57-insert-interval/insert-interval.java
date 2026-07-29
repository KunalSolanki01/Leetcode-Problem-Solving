class Solution {
    public int[][] insert(int[][] occupiedIntervals, int[] newInterval) {
        List<int[]> ls = new ArrayList<>();
        int i=0;
        for(;i<occupiedIntervals.length && newInterval[0]>occupiedIntervals[i][1];i++){
            ls.add(occupiedIntervals[i]);
        } 
        for(;i<occupiedIntervals.length && newInterval[1]>=occupiedIntervals[i][0];i++){
            newInterval[0] = Math.min(newInterval[0],occupiedIntervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],occupiedIntervals[i][1]);
        }
        ls.add(newInterval);
        for(;i<occupiedIntervals.length;i++){
            ls.add(occupiedIntervals[i]);
        }
        return ls.toArray(new int[ls.size()][]);
    }
}