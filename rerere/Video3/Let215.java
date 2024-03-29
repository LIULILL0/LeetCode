package rerere.Video3;

import java.util.Arrays;

/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 */
public class Let215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i <= nums.length - k; i++) {
             j = nums[i];
        }
        return j;
    }
}
