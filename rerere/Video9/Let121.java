package rerere.Video9;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意你不能在买入股票前卖出股票。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 */
public class Let121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <2)
            return 0;
        int min = prices[0];
        int maxProfit = prices[1] - prices[0];
        for (int i = 1; i < prices.length; i++) {
             min = Math.min(min,prices[i]);
             int cur = prices[i] - min;
             maxProfit = Math.max(cur,maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Let121 l = new Let121();
        int[] a = {7,1,5,3,6,4};
        System.out.println(l.maxProfit(a));
    }
}
