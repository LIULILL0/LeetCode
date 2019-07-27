package rerere.Video4;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3, t = 0
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [1,0,1,1], k = 1, t = 2
 * 输出: true
 */
public class Let220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums==null || nums.length==0)
            return false;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put((long)nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            for (Map.Entry<Long,Integer> m :map.entrySet()){
                if(Math.abs(m.getKey()-nums[i])<=t && Math.abs(m.getValue()-i)<=k){
                    return true;
                }
            }
            map.put((long)nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[]a ={-1,2147483647};

        System.out.println(new Let220().containsNearbyAlmostDuplicate(a,1,2147483647));
    }
}
