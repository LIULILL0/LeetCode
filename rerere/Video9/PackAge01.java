package rerere.Video9;

public class PackAge01 {
    public static int knapsack01(int[] w, int[] v, int C) {
        if (w == null || v == null || w.length != v.length)
            throw new IllegalArgumentException("Invalid w or v");

        int n = w.length;
        int[][] memo = new int[n][C+1];
        for (int j = 0; j <=C ; j++) {
            memo[0][j] = j>w[0] ? v[j] : 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= C; j++) {
                memo[i][j] = memo[i - 1][j];
                if (j >= w[i]) {
                    memo[i][j] = Math.max(memo[i][j],memo[i-1][j-w[i]]+v[i]);
                }
            }
        }
        return memo[n-1][C];

    }
    public static void main(String[] args) {
        int[]a = {1,2,3};
        int[]b = {6,10,12};
        System.out.println(knapsack01(a,b,5));
    }
}
