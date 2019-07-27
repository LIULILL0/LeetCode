package rerere.Video8;

/**
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 * <p>
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 * <p>
 * 示例:
 * <p>
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * <p>
 * 运行你的函数后，矩阵变为：
 * <p>
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 */
public class Let130 {
    private int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    int rows, cols;

    public void solve(char[][] board) {
        if (board == null || board.length == 0)
            return;

        rows = board.length;
        cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    dfs(board, i, j);
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'M') {
                    board[i][j] = 'O';
                }
            }
        }

    }

    private void dfs(char[][] board, int x, int y) {
        if (x < 0 || x >= rows || y < 0 || y >= cols || board[x][y] != '0') {
            return;
        }

        board[x][y] = 'M';
        for (int i = 0; i < 4; i++) {
            int newX = x + dir[i][0];
            int newY = y + dir[i][1];
            dfs(board, newX, newY);
        }
    }
}
