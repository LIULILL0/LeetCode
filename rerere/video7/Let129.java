package rerere.video7;


/**
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 *
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 *
 * 计算从根到叶子节点生成的所有数字之和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 *     1
 *    / \
 *   2   3
 * 输出: 25
 * 解释:
 * 从根到叶子节点路径 1->2 代表数字 12.
 * 从根到叶子节点路径 1->3 代表数字 13.
 * 因此，数字总和 = 12 + 13 = 25.
 */
public class Let129 {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    private int sum(TreeNode root, int i) {
        if (root == null)
            return 0;

        if (root.right == null && root.left == null)
            return i * 10 + root.val;

        int present = i*10+root.val;
        return sum(root.left,present)+sum(root.right,present);
    }

    public static void main(String[] args) {
        Let129 l = new Let129();
        TreeNode root = new TreeNode(2);
        TreeNode p2 = new TreeNode(1);
        TreeNode p3 = new TreeNode(3);
     //   TreeNode p5 = new TreeNode(5);
        root.left = p2;
        root.right=p3;
      //  p2.left=p5;
        System.out.println(l.sumNumbers(root));
    }
}
