package rerere.Video8;

/**
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * <p>
 * 示例:
 * <p>
 * board =
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * <p>
 * 给定 word = "ABCCED", 返回 true.
 * 给定 word = "SEE", 返回 true.
 * 给定 word = "ABCB", 返回 false.
 */
public class Let79 {
    private int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private boolean[][] used;

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        used = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, i, j, word, 0, rows, cols))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int x, int y, String word, int index, int rows, int cols) {
        if (index == word.length() - 1)
            return word.charAt(index) == board[x][y];

        if (word.charAt(index) == board[x][y]) {
            used[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int newX = x + dir[i][0];
                int newY = y + dir[i][1];
                if (isArea(newX, newY, rows, cols) && !used[newX][newY] && dfs(board, newX, newY, word, index + 1, rows, cols)) {
                    return true;
                }
            }
            used[x][y] = false;
        }
        return false;

    }

    private boolean isArea(int newX, int newY, int rows, int cols) {
        return newX >= 0 && newX < rows && newY >= 0 && newY < cols;
    }

    public static void main(String[] args) {
        Let79 l = new Let79();
        char[][] board={{'a','b'}};
        System.out.println(l.exist(board, "ba"));
    }
}
