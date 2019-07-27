package rerere.Video8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []


 */
public class Let78 {
    private List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        res.add(list);
        dfs(nums, 0, list);
        return res;


    }

    private void dfs(int[] nums, int start, LinkedList<Integer> list) {
        if (start > nums.length)
            return;

        for (int i = start; i < nums.length; i++) {
            list.addLast(nums[i]);
            res.add(new ArrayList<>(list));
            dfs(nums, i + 1, list);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        Let78 l = new Let78();
        int[]a = {1,2,3};
        System.out.println(l.subsets(a));
    }
}
