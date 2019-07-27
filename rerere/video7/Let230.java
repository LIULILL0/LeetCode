package rerere.video7;

import java.util.ArrayList;


/**
 * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 *
 * 说明：
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 *
 * 示例 1:
 *
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 1
 */
public class Let230 {
    int index = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return 0;

        int l = kthSmallest(root.left,k);
        if(l!=0)
            return l;
        index++;
        if(index==k){
            return root.val;
        }

        int r = kthSmallest(root.right,k);
        if(r!=0)
            return r;

        return 0;
    }
}
