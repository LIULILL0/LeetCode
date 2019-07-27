package rerere.Video3;

import java.util.Arrays;

public class Offer75 {
    public void sortColors(int[] nums) {
        int zero = -1;
        int two = nums.length;
        int i = 0;
        while (i<two){
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                --two;
                swap(nums, i, two);
            } else {
                zero++;
                swap(nums, i, zero);
                i++;
            }
        }

    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;

    }
}
