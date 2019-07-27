package rerere.video7;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 */
public class Let101 {
    public boolean isSymmetric(TreeNode root) {
        return isMinor(root, root);
    }

    private boolean isMinor(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null)
            return true;
        if (root == null || root1 == null)
            return false;

        if (root.val != root1.val) {
            return false;
        }

        return isMinor(root.left, root1.right) && isMinor(root.right, root1.left);


    }
}
