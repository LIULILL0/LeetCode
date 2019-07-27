package rerere.Video9;

import java.util.Arrays;

public class Let213 {
    int[] memo;
    int[] memo1;

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        memo = new int[nums.length];
        memo1 = new int[nums.length];
        Arrays.fill(memo, -1);
        Arrays.fill(memo1, -1);
        int r = tryRob(nums, 0);
        int r1 = tryRob1(nums, 1);
        return Math.max(r, r1);

    }

    private int tryRob(int[] nums, int index) {
        if (index >= nums.length)
            return 0;
        if (memo[index] != -1)
            return memo[index];
        int res = 0;
        for (int i = index; i < nums.length - 1; i++) {
            res = Math.max(nums[i] + tryRob(nums, i + 2), res);
        }
        memo[index] = res;

        return res;
    }

    private int tryRob1(int[] nums, int index) {
        if (index >= nums.length)
            return 0;
        if (memo1[index] != -1)
            return memo1[index];
        int res = 0;
        for (int i = index; i < nums.length ; i++) {
            res = Math.max(nums[i] + tryRob1(nums, i + 2), res);
        }
        memo1[index] = res;

        return res;
    }

    public static void main(String[] args) {
        Let213 l = new Let213();
        int[] a = {1,3,1,3,100};
        System.out.println(l.rob(a));
    }
}
