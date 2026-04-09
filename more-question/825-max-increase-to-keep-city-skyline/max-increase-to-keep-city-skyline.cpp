class Solution {
public:
    int maxIncreaseKeepingSkyline(vector<vector<int>>& grid) {
    int n = grid.size();
    vector<int> row(n, 0);
    vector<int> col(n, 0);
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            row[i] = max(row[i], grid[i][j]);
            col[j] = max(col[j], grid[i][j]);
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int height = min(row[i], col[j]);
            count += height - grid[i][j];
        }
    }
    return count;
    }
};