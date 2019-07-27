package rerere.Video4;

import java.util.HashMap;

/**
 * 给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 * <p>
 * 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [[0,0],[1,0],[2,0]]
 * <p>
 * 输出:
 * 2
 * <p>
 * 解释:
 * 两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
 */
public class Let447 {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int dis = d(points[i],points[j]);
                    if(map.containsKey(dis)){
                        map.put(dis,map.get(dis)+1);
                    }else {
                        map.put(dis,1);
                    }
                }
            }
            for(Integer dis :map.keySet()){
                res+=map.get(dis)*(map.get(dis)-1);
            }
        }
        return res;
    }

    private int d(int[] pa, int[] pb) {
        return (pa[0] - pb[0]) * (pa[0] - pb[0]) +
                (pa[1] - pb[1]) * (pa[1] - pb[1]);
    }

    public static void main(String[] args) {
        int[][]p = {{0,0},{1,0},{2,0}};
        Let447 l =new Let447();
        System.out.println(l.numberOfBoomerangs(p));
    }
}
