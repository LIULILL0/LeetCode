package rerere.Video8;

import java.util.*;

/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的每个数字在每个组合中只能使用一次。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。
 * <p>
 * 示例 1:
 * <p>
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 */
public class Let40 {
    private List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, new LinkedList<>(),target);

        return res;
    }

    private void dfs(int[] candidates, int index, LinkedList<Integer> list,int target) {
      if(target==0){
          res.add(new ArrayList<>(list));
          return;
      }
      if(index==candidates.length || candidates[index]>target)
          return;

        for (int i = index; i < candidates.length; i++) {
            if(i!=index && candidates[i-1]==candidates[i]){
                continue;
            }
            list.addLast(candidates[i]);
            dfs(candidates, i + 1, list,target-candidates[i]);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        Let40 l = new Let40();
        int[] a = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(l.combinationSum2(a, 8));
    }
}
