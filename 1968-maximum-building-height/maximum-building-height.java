import java.util.*;

class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        List<int[]> res = new ArrayList<>(Arrays.asList(restrictions));
        res.add(new int[]{1, 0});
        Collections.sort(res,(a,b)->a[0]-b[0]);
        int m = res.size();
        for (int i = 1;i<m;i++) {
            int dist = res.get(i)[0]-res.get(i-1)[0];
            res.get(i)[1] = Math.min(res.get(i)[1], res.get(i - 1)[1] + dist);
        }
        for (int i = m-2;i>=0;i--) {
            int dist = res.get(i+1)[0]-res.get(i)[0];
            res.get(i)[1] = Math.min(res.get(i)[1],res.get(i+1)[1]+dist);
        }
        int maxH = 0;
        for (int i = 0; i < m - 1; i++) {
            int id1 = res.get(i)[0], h1 = res.get(i)[1];
            int id2 = res.get(i + 1)[0], h2 = res.get(i + 1)[1];
            maxH = Math.max(maxH,(h1+h2+(id2-id1))/2);
        }
        int lastId = res.get(m-1)[0];
        int lastH = res.get(m-1)[1];
        maxH = Math.max(maxH,lastH+(n-lastId));
        return maxH;
    }
}
