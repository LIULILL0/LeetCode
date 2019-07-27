package rerere.video7;


/**
 * 计算给定二叉树的所有左叶子之和。
 * <p>
 * 示例：
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */
public class Let404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        int res = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            res = res + root.left.val;
        }
        int l = sumOfLeftLeaves(root.left);
        int r = sumOfLeftLeaves(root.right);

        return l + r + res;
    }
}
