package rerere.Video3;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class Let283 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                swap(nums,k,i);
                k++;
            }
        }


        for (int c : nums) {
            System.out.println(c);
        }
    }

    private void swap(int[] nums, int k, int i) {
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
    }

    public static void main(String[] args) {
        Let283 l = new Let283();
        int[] c = {0, 1, 3, 0, 12};
        l.moveZeroes(c);
    }
}
