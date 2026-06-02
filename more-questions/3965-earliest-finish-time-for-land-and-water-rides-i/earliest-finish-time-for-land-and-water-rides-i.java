class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
        int n = landDuration.length;
        int m = waterDuration.length;
        for(int i=0;i<n;i++){
            min1 = Math.min(min1,(landStartTime[i]+landDuration[i]));
        }
        for(int i=0;i<m;i++){
            min2 = Math.min(min2,(waterStartTime[i]+waterDuration[i]));
        }
        int total = Integer.MAX_VALUE;
        for (int i=0;i<m;i++) {
            total=Math.min(total, Math.max(min1,waterStartTime[i])+waterDuration[i]);
        }
        for (int i=0;i<n;i++) {
            total=Math.min(total, Math.max(min2,landStartTime[i])+landDuration[i]);
        }
        return total;
    }
}