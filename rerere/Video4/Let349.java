package rerere.Video4;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 */
public class Let349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : nums2) {
            if (set.contains(number)) {
                list.add(number);
                set.remove(number);
            }
        }
        int[]res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]  = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
