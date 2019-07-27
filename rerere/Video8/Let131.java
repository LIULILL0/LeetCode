package rerere.Video8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 * <p>
 * 返回 s 所有可能的分割方案。
 * <p>
 * 示例:
 * <p>
 * 输入: "aab"
 * 输出:
 * [
 * ["aa","b"],
 * ["a","a","b"]
 * ]
 */
public class Let131 {
    private List<List<String>> res;

    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        if (s == null || s.length() == 0)
            return res;
        dfs(s, 0, new LinkedList<>());
        return res;

    }

    private void dfs(String s, int index, LinkedList<String> list) {
        if (index == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindromes(s, index, i)) {
                list.addLast(s.substring(index, i + 1));
                dfs(s, i + 1, list);
                list.removeLast();
            }
        }


    }

    private boolean isPalindromes(String s, int l, int r) {
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        return l >= r;
    }

    public static void main(String[] args) {
        Let131 l =new Let131();
        System.out.println(l.partition("aab"));
    }
}
