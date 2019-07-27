package rerere.Video8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 */
public class Let51 {
    List<List<String>> res;
    boolean[] col;
    boolean[] dia1;
    boolean[] dia2;

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        col = new boolean[n];
        dia1 = new boolean[2 * n - 1];
        dia2 = new boolean[2 * n - 1];
        LinkedList<Integer> row = new LinkedList<>();
        putQueen(n, 0, row);
        return res;
    }

    private void putQueen(int n, int index, LinkedList<Integer> row) {
        if (index == n) {
            res.add(generateBoard(n, row));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!col[i] && !dia1[index + i] && !dia2[index - i + n - 1]) {
                row.addLast(i);
                col[i] = true;
                dia1[i + index] = true;
                dia2[index - i + n - 1] = true;
                putQueen(n, index + 1, row);
                col[i] = false;
                dia1[i + index] = false;
                dia2[index - i + n - 1] = false;
                row.removeLast();

            }
        }
        return;
    }

    private List<String> generateBoard(int n, LinkedList<Integer> row) {
        ArrayList<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] chars = new char[n];
            Arrays.fill(chars,'.');
            chars[row.get(i)] = 'Q';
            board.add(new String(chars));
        }
        return board;
    }
}
