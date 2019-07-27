package rerere.Video3;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 * <p>
 * 示例:
 * <p>
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 */
public class Let209 {
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = -1;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while (l < nums.length) {
            if ((r + 1) < nums.length && sum < s) {
                r++;
                sum += nums[r];
            } else {
                sum -= nums[l];
                l++;
            }
            if (sum >= s) {
                res = Math.min(res, r - l + 1);
            }
        }
        if (res == Integer.MAX_VALUE)
            return 0;
        return res;
    }

    public static void main(String[] args) {
        Let209 l = new Let209();
        int[] a = {2, 3, 1, 2, 4, 3};
        System.out.println(l.minSubArrayLen(7, a));
    }
}
