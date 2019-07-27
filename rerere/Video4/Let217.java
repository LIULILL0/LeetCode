package rerere.Video4;

import java.util.HashSet;

/**
 *  *给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 */
public class Let217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer c :nums){
            if(set.contains(c)){
                return true;
            }else
                set.add(c);
        }
        return false;
    }
}
