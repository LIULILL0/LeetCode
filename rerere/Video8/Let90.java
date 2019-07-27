package rerere.Video8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,2]
 * 输出:
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
 * [1,2],
 * []
 * ]
 */
public class Let90 {
    private List<List<Integer>> res;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        res.add(new LinkedList<>());
        Arrays.sort(nums);
        dfs(nums, 0, new LinkedList<>());
        return res;
    }

    private void dfs(int[] nums, int index, LinkedList<Integer> list) {
        if (index >= nums.length)
            return;
        for (int i = index; i < nums.length; i++) {
            if(i!=index && nums[i] ==nums[i-1]){
                continue;
            }
            list.addLast(nums[i]);
            res.add(new ArrayList<>(list));
            dfs(nums,i+1,list);
            list.removeLast();
        }

    }

    public static void main(String[] args) {
        Let90 l =new Let90();
        int[] a = {4,4,4,1,4};
        System.out.println(l.subsetsWithDup(a));
    }
}
