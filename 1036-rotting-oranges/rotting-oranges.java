class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        Queue<int[]> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) fresh++;
                else if(grid[i][j]==2) q.add(new int[] {i,j});
            }
        }
        if(fresh==0) return 0;
        int []row = {-1,1,0,0};
        int []col = {0,0,-1,1};
        int min = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int []cur = q.poll();
                for(int k=0;k<4;k++){
                    int x = cur[0]+row[k];
                    int y = cur[1]+col[k];
                    if(x>=0 && x<n && y>=0 && y<m && grid[x][y]==1){
                        fresh--;
                        grid[x][y] = 2;
                        q.add(new int[] {x,y});
                    }
                }
            }
            min++;
        }
        return (fresh==0)?min-1:-1;
    }
}