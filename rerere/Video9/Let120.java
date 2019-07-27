package rerere.Video9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * <p>
 * 例如，给定三角形：
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * <p>
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 */
public class Let120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null)
            return 0;
        int n = triangle.size();
        int[] dp = new int[n+1];
        for (int i = n - 1; i >= 0; i--) {
            List<Integer> curList = triangle.get(i);
            for (int j=0;j<curList.size();j++){
                dp[j] = Math.min(dp[j],dp[j+1])+curList.get(j);
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Let120 l = new Let120();
        List<Integer> list1 = Arrays.asList(2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(6,5,7);
        List<Integer> list4 = Arrays.asList(4,1,8,3);
        List<List<Integer>> res  = new ArrayList<>();
        res.add(list1);
        res.add(list2);
        res.add(list3);
        res.add(list4);
        System.out.println(l.minimumTotal(res));
    }
}
