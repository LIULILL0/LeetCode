package rerere.Video3;

public class Let11 {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxSize = 0;
        while (high >= low) {
            int size = (high - low) * Math.min(height[low], height[high]);
            if (size > maxSize) {
                maxSize = size;
            }
            if(height[low]>height[high])
                high--;
            else
               low++;
        }
        return maxSize;
    }

    public static void main(String[] args) {
        Let11 l = new Let11();
        System.out.println(l.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}
