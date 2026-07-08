class Solution {
    public int minimumLines(int[][] stockPrices) {
        int n = stockPrices.length;
        if(n<=1) return 0;
        Arrays.sort(stockPrices, (a,b)->Integer.compare(a[0],b[0]));
        int total = 1;
        for(int i=2;i<n;i++){
            int x1 = stockPrices[i-1][0]-stockPrices[i][0];
            int x2 = stockPrices[i-2][0]-stockPrices[i-1][0];
            int y1 = stockPrices[i-1][1]-stockPrices[i][1];
            int y2 = stockPrices[i-2][1]-stockPrices[i-1][1];
            if(x1*y2 != y1*x2) total++;
        }
        return total;
    }
}