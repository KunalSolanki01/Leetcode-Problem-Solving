class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int price = 0;
        int n = cost.length;
        int ex = 0;
        for(int i=n-1;i>=0;i--){
            ex++;
            if(ex==3){
                ex = 0;
                continue;
            }
            price+=cost[i];
        }
        return price;
    }
}