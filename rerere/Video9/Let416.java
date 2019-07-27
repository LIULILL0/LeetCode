package rerere.Video9;

/**
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * <p>
 * 注意:
 * <p>
 * 每个数组中的元素不会超过 100
 * 数组的大小不会超过 200
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1, 5, 11, 5]
 * <p>
 * 输出: true
 * <p>
 * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
 */
public class Let416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int c : nums) {
            sum += c;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int C = sum / 2;
        boolean[] dp = new boolean[C + 1];
        for (int i = 0; i <= C; i++) {
            dp[i] = (nums[0] == i);
        }
        for (int i = 1; i <nums.length; i++) {
            for (int j = C; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[C];
    }

    public static void main(String[] args) {
        Let416 l =new Let416();
        int[] a = {1,5,4};
        System.out.println(l.canPartition(a));
    }
}
