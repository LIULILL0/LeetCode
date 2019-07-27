package rerere.Video9;

import java.util.Arrays;

/**
 * 给定一个由正整数组成且不存在重复数字的数组，找出和为给定目标正整数的组合的个数。
 * <p>
 * 示例:
 * <p>
 * nums = [1, 2, 3]
 * target = 4
 * <p>
 * 所有可能的组合为：
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 * <p>
 * 请注意，顺序不同的序列被视作不同的组合。
 * <p>
 * 因此输出为 7。
 */
public class Let377 {
    private int[]memo;
    public int combinationSum4(int[] nums, int target) {
        memo = new int[target + 1];
        Arrays.fill(memo,-1);
        dfs(nums,target);
        return memo[target];
    }
    public int dfs(int[]nums,int target){
        if(memo[target]!=-1)
            return memo[target];
        if(target==0)
            return 1;
        int res = 0;
        for(int num : nums){
            if(target>=num){
                res +=dfs(nums,target - num);
            }
        }
        memo[target] = res;
        return res;
    }
    public static void main(String[] args) {
        Let377 l = new Let377();
        int[] a = {1, 2, 3};
        System.out.println(l.combinationSum4(a, 4));
    }
}
