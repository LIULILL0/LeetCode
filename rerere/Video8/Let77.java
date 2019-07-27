package rerere.Video8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */
public class Let77 {
    private List<List<Integer>> res;

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        if (n < 0 || k < 0 || k > n)
            return res;
        LinkedList<Integer> list = new LinkedList<>();
        dfs(n, k, 1, list);
        return res;

    }

    private void dfs(int n, int k, int start, LinkedList<Integer> list) {
        if (list.size() == k) {
            res.add(new LinkedList<>(list));
            return;
        }

        for (int i = start; i <= n; i++) {
            list.addLast(i);
            dfs(n, k, i + 1, list);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        Let77 l =new Let77();
        System.out.println(l.combine(4,2));
    }
}
