package rerere.video7;

/**
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最小深度  2.
 */
public class Let111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null) {
            int rightDepth = minDepth(root.right) + 1;
            return rightDepth;
        }
        if (root.right == null) {
            int leftDepth = minDepth(root.left) + 1;
            return leftDepth;
        }

        int l = minDepth(root.left);
        int r = minDepth(root.right);

        return Math.min(l,r)+1;


    }
}
