package rerere.Video4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class Let15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //跳过大于0的开始，因为三个正数相加不可能等于0
            if (nums[i] > 0) {
                break;
            }
            //跳过相同的数，避免重复
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //两头往中间走，j在左，k在右
            int j = i + 1;
            int k = nums.length - 1;
            int target = 0 - nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    //跳过相同的数
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (nums[j] + nums[k] < target)
                    j++;
                else {
                    k--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Let15 l =new Let15();
        int[] n = {-1, 0, 1, 2, -1, -4};
        System.out.println(l.threeSum(n));
    }
}
