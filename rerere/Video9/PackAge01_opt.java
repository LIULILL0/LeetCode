package rerere.Video9;

public class PackAge01_opt {
    public static int knapsack01(int[] w, int[] v, int C) {
        int n = w.length - 1;
        int[] dp = new int[C + 1];
        //进行初始化
        for (int j = 0; j <= C; j++) {
            dp[j] = j >= w[0] ? v[0] : 0;
        }
        for (int i = 1; i <=n; i++) {
            for (int j = C; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j],v[i] + dp[j-w[i]]);
            }
        }
        return dp[C];
    }

    public static void main(String[] args) {
        int[]a = {1,2,3};
        int[]b = {6,10,12};
        System.out.println(knapsack01(a,b,5));
    }
}
