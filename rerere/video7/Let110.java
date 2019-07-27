package rerere.video7;


/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 */
public class Let110 {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftDepth = getDepth(root.left);
        if (leftDepth == -1)
            return -1;

        int rightDepth = getDepth(root.right);
        if (rightDepth == -1)
            return -1;

        return Math.abs(leftDepth-rightDepth)>1?-1:1+Math.max(leftDepth,rightDepth);
    }
}
