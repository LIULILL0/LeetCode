package rerere.Video3;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例 1:
 * <p>
 * 给定 nums = [1,1,1,2,2,3],
 * <p>
 * 函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class Offer80 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(k<2 || nums[i]>nums[k-2]){
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Offer80 o = new Offer80();
        int[] a = {1,1,1,2,2,3};
        System.out.println(o.removeDuplicates(a));
    }
}
