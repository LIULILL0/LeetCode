package rerere.Video9;

import java.util.Arrays;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 * 说明:
 * 你可以认为每种硬币的数量是无限的。
 */
public class Let322 {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0)
            return -1;
        int[]dp = new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int c : coins){
                if(i>=c && dp[i-c]!=-1 && c>=0){
                    dp[i] =Math.min(dp[i-c]+1,dp[i]);
                }
            }
            if( dp[i] == Integer.MAX_VALUE){
                dp[i] = -1;
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        Let322 o = new Let322();
        int[]a = {1,2,5};
        System.out.println(o.coinChange(a,11));
    }
}
