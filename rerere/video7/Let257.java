package rerere.video7;



import java.util.ArrayList;
import java.util.List;

/**
 * 题目描述：给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * <p>
 * 输出: ["1->2->5", "1->3"]
 * <p>
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */

public class Let257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        if (root.right == null && root.left == null) {

            res.add(root.val + "");
            return res;
        }


        List<String> leftS = binaryTreePaths(root.left);
        for (int i = 0; i < leftS.size(); i++) {
            res.add(root.val + "->" + leftS.get(i));
        }

        List<String> rightS = binaryTreePaths(root.right);
        for (int i = 0; i < rightS.size(); i++) {
            res.add(root.val + "->" + rightS.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Let257 l = new Let257();
        TreeNode root = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        TreeNode p5 = new TreeNode(5);
        root.left = p2;
        root.right = p3;
        p2.right = p5;

        System.out.println(l.binaryTreePaths(root));
    }


}
