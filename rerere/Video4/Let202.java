package rerere.Video4;

import java.util.HashSet;

/**
 * 编写一个算法来判断一个数是不是“快乐数”。
 * <p>
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * <p>
 * 示例:
 * <p>
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class Let202 {
    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int next = getNum(n);
            if (next == 1)
                return true;

            if (set.contains(next))
                return false;
            set.add(next);

            n = next;
        }
    }

    private int getNum(int n) {
        int res = 0;
        while (n != 0) {
            res += Math.pow(n % 10, 2);
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Let202 l =new Let202();
        System.out.println(l.isHappy(20));
    }
}
