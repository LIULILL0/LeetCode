package rerere.Video8;

import LeetCode.Let4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,1,2]
 * 输出:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 */
public class Let47 {
    boolean[] used;
    List<List<Integer>> res;

    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        res = new ArrayList<>();
        dfs(nums, 0, new LinkedList<>());

        HashSet<List>set = new HashSet<>();
        for(List r :res){
            set.add(r);
        }
        res.clear();
        for(List s :set){
            res.add(s);
        }
        return res;
    }

    private void dfs(int[] nums, int index, LinkedList<Integer> list) {
        if (index == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                list.addLast(nums[i]);
                used[i] = true;

                dfs(nums, index + 1, list);

                list.removeLast();
                used[i] = false;
            }
        }
        return;
    }
}
