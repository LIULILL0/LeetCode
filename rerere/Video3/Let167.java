package rerere.Video3;

/**
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * <p>
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * <p>
 * 说明:
 * <p>
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * <p>
 * 示例:
 * <p>
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */
public class Let167 {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int[] t=new int[2];
        while (high >= low) {
            if(numbers[low]+numbers[high]==target){
                t[0] = low+1;
                t[1] = high+1;
                return t;

            }else if(numbers[low]+numbers[high]>target){
                high--;
            }else
                low++;
        }
        return t;
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        Let167 l = new Let167();
        System.out.println(l.twoSum(a,9));
    }
}
