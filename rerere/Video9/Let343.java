package rerere.Video9;

import java.util.Arrays;

/**
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 */
public class Let343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i],Math.max(j*dp[i-j],(i-j)*j));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Let343 l = new Let343();
        System.out.println(l.integerBreak(8));
    }
}
