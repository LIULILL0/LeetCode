package rerere.Video4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 */
public class Let350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            if(map.containsKey(n) && map.get(n)>0){
                list.add(n);
                map.put(n,map.get(n)-1);
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
