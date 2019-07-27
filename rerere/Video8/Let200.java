package rerere.Video8;

/**
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，
 * 并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * 11110
 * 11010
 * 11000
 * 00000
 * <p>
 * 输出: 1
 */
public class Let200 {
    int cols;
    int rows;
    int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    boolean[][] used;

    public int numIslands(char[][] grid) {
        rows = grid.length;
        if (rows == 0)
            return 0;
        cols = grid[0].length;
        used = new boolean[rows][cols];
        int res = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && !used[i][j]) {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int x, int y) {
        used[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + dir[i][0];
            int newY = y + dir[i][1];
            if (isArea(grid, newX, newY) && !used[newX][newY] && grid[newX][newY] == '1') {
                dfs(grid, newX, newY);
            }
        }
        return;
    }

    private boolean isArea(char[][] grid, int x, int y) {
        return x < rows && x >= 0 && y >= 0 && y < cols;
    }
}
