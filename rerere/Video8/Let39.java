package rerere.Video8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的数字可以无限制重复被选取。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 * <p>
 * 示例 1:
 * <p>
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 * [7],
 * [2,2,3]
 * ]
 */
public class Let39 {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        if (candidates == null)
            return res;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, list);
        return res;
    }

    private void dfs(int[] candidates, int target, int index, ArrayList<Integer> tmp) {
        if (target == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        if(target<candidates[0])
            return;
        for (int i = index; i < candidates.length && candidates[i] <= target; i++) {
            ArrayList<Integer> list = new ArrayList<>(tmp);
            list.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, list);
        }
        return;
    }

    public static void main(String[] args) {
        Let39 l =new Let39();
        int[]a = {8,4,7,3};
        System.out.println(l.combinationSum(a,11));
    }
}
