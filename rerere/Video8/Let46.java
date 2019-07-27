package rerere.Video8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 */
public class Let46 {
    boolean[] used;
    List<List<Integer>> res;

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        partiton(nums, 0, list);
        return res;
    }

    private void partiton(int[] nums, int index, LinkedList<Integer> list) {
        if (index == nums.length) {
            res.add(new LinkedList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                list.addLast(nums[i]);
                used[i] = true;
                partiton(nums, index + 1, list);
                list.removeLast();
                used[i] = false;
            }
        }
        return;
    }

    public static void main(String[] args) {
        Let46 l = new Let46();
        int[] a = {1, 2, 3};
        System.out.println(l.permute(a));
    }
}
