package rerere.Video9;

/**
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 */
public class Let279 {
    public int numSquares(int n) {
        int[]dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            int x = (int)Math.sqrt(i);
            int min = i;
            for(int j=1;j<=x;j++){
                min = Math.min(min,dp[i - j*j]+1);
            }
            dp[i] = min;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Let279 l =new Let279();
        System.out.println(l.numSquares(12));
    }
}
