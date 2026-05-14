class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
        int s = 0;
        int c = 0;
        for(int i=0;i<tasks.length;i++){
            System.out.print(c+" ");
            if(tasks[i][1]>c){
                s+=(tasks[i][1]-c);
                c+=(tasks[i][1]-c);
                System.out.print(c+" ");
            }
            c-=tasks[i][0];
            System.out.println(c+" ");
        }
        return s;
    }
}