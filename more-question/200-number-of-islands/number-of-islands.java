class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new ArrayDeque<>();
        int[] r = { -1, 1, 0, 0 };
        int[] c = { 0, 0, -1, 1 };
        // BFS
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    vis[i][j] = true;
                    q.add(new int[] { i, j });
                    while (!q.isEmpty()) {
                        int s = q.size();
                        for (int i1 = 0; i1 < s; i1++) {
                            int[] temp = q.poll();
                            for (int j1 = 0; j1 < 4; j1++) {
                                int x = temp[0] + r[j1];
                                int y = temp[1] + c[j1];
                                if (x >= 0 && y >= 0 && x < n && y < m && grid[x][y] == '1' && !vis[x][y]) {
                                    vis[x][y] = true;
                                    q.add(new int[] { x, y });
                                }
                            }
                        }
                    }
                    count++;
                }
            }
        }

        return count;
    }
}